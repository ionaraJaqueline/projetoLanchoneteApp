package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import entities.Usuario;
import filters.UsuarioFilter;

public class ImplementeUsuarioDao extends DAO implements UsuarioDAO{

	@Override
	public void save(Usuario obj) throws PersistenciaDacaException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			em.persist(obj);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			transaction.rollback();
			throw new PersistenciaDacaException("Ocorreu algum erro ao tentar salvar o usuário.", pe);
		} finally {
			em.close();
		}
		
	}

	@Override
	public Usuario update(Usuario obj) throws PersistenciaDacaException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Usuario resultado = obj;
		try {
			resultado = em.merge(obj);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			transaction.rollback();
			throw new PersistenciaDacaException("Ocorreu algum erro ao tentar atualizar o usuário.", pe);
		} finally {
			em.close();
		}
		return resultado;
	}
	

	@Override
	public void delete(Usuario obj) throws PersistenciaDacaException {
		EntityManager em = getEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		try {
			obj = em.find(Usuario.class, obj.getId());
			em.remove(obj);
			transaction.commit();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			transaction.rollback();
			throw new PersistenciaDacaException("Ocorreu algum erro ao tentar remover o usuário.", pe);
		} finally {
			em.close();
		}
		
	}

	@Override
	public Usuario getByID(Integer objId) throws PersistenciaDacaException {
		EntityManager em = getEntityManager();
		Usuario resultado = null;
		try {
			resultado = em.find(Usuario.class, objId);
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			throw new PersistenciaDacaException("Ocorreu algum erro ao tentar recuperar o usuário com base no ID.", pe);
		} finally {
			em.close();
		}

		return resultado;
	}

	@Override
	public List<Usuario> getAll() throws PersistenciaDacaException {
		EntityManager em = getEntityManager();
		List<Usuario> resultado = null;
		try {
			TypedQuery<Usuario> query = em.createQuery("SELECT u FROM User u", Usuario.class);
			resultado = query.getResultList();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			throw new PersistenciaDacaException("Ocorreu algum erro ao tentar recuperar todos os usuários.", pe);
		} finally {
			em.close();
		}
		return resultado;
	}

	@Override
	public List<Usuario> findBy(UsuarioFilter filter) throws PersistenciaDacaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existeUsuarioComLogin(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
