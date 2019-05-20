package daoImplMemory;

import java.util.ArrayList;
import java.util.List;

import dao.DAO;
import dao.PersistenciaDacException;
import dao.UsuarioDAO;
import entities.Usuario;
import filters.UsuarioFilter;



public class UsuarioInMemoryDAO extends DAO implements UsuarioDAO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private InMemoryDB db = new InMemoryDB();

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#save(br.edu.ifpb.mt.dac.entities.User)
	 */
	@Override
	public void save(Usuario obj) throws PersistenciaDacException {
		db.save(obj);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#update(br.edu.ifpb.mt.dac.entities.User)
	 */
	@Override
	public Usuario update(Usuario obj) throws PersistenciaDacException {
		return (Usuario) db.update(obj);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#delete(br.edu.ifpb.mt.dac.entities.User)
	 */
	@Override
	public void delete(Usuario obj) throws PersistenciaDacException {
		db.delete(obj);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#getByID(java.lang.Integer)
	 */
	@Override
	public Usuario getByID(Integer objId) throws PersistenciaDacException {
		return (Usuario) db.getByID(objId).clone();
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#getAll()
	 */
	@Override
	public List<Usuario> getAll() throws PersistenciaDacException {
		List<Usuario> resultado = new ArrayList<>();
		for (Usuario obj : db.getAll(Usuario.class)) {
			resultado.add(obj.clone());
		}
		return resultado;
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#findBy(br.edu.ifpb.mt.dac.filters.UserFilter)
	 */
	@Override
	public List<Usuario> findBy(UsuarioFilter filter) throws PersistenciaDacException {

		List<Usuario> allObjs = getAll();

		if (filter == null || filter.isEmpty()) {
			return allObjs;
		}

		List<Usuario> resultado = new ArrayList<>();
		for (Usuario usuario : allObjs) {
			// First name
			if (notEmpty(filter.getNome())) {
				if (!contains(usuario.getNome(), filter.getNome())) {
					continue;
				}
			}

			// Last name
			if (notEmpty(filter.getSobreNome())) {
				if (!contains(usuario.getSobreNome(), filter.getSobreNome())) {
					continue;
				}
			}

			// Birthday begin
			if (notEmpty(filter.getInicioDataDeAniversario())) {
				if (!assertDate(usuario.getDataDeAniversario(), filter.getInicioDataDeAniversario(), true)) {
					continue;
				}
			}

			// Birthday end
			if (notEmpty(filter.getFimDataDeAniversario())) {
				if (!assertDate(usuario.getDataDeAniversario(), filter.getFimDataDeAniversario(), false)) {
					continue;
				}
			}

			// Group
			if (notEmpty(filter.getGroup())) {
				if (!equals(filter.getGroup(), usuario.getGroup())) {
					continue;
				}
			}

			resultado.add(usuario);
		}

		return resultado;

	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.mt.dac.dao.UserDAO#existeUsuarioComLogin(br.edu.ifpb.mt.dac.entities.User)
	 */
	@Override
	public boolean existeUsuarioComLogin(Usuario usuario) {
		if (usuario == null) {
			return false;
		}
		for (Usuario aUsuario : db.getAll(Usuario.class)) {
			if (aUsuario.getId().equals(usuario.getId())) continue;
			
			boolean loginIgual = aUsuario.getLogin().trim().equalsIgnoreCase(usuario.getLogin());
			if (loginIgual) {
				return true;
			}
		}
		return false;
	}
	
}

