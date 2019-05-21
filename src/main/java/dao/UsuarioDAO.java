package dao;

import java.util.List;

import entities.Usuario;
import filters.UsuarioFilter;



public interface UsuarioDAO {
	void save(Usuario obj) throws PersistenciaDacaException;

	Usuario update(Usuario obj) throws PersistenciaDacaException;

	void delete(Usuario obj) throws PersistenciaDacaException;

	Usuario getByID(Integer objId) throws PersistenciaDacaException;

	List<Usuario> getAll() throws PersistenciaDacaException;

	List<Usuario> findBy(UsuarioFilter filter) throws PersistenciaDacaException;

	boolean existeUsuarioComLogin(Usuario usuario);
}
