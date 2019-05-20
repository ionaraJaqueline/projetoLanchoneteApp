package beansUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;
import entities.Group;
import entities.Usuario;
import impl.UsuarioServiceImpl;
import service.ServiceDacException;
import service.UsuarioService;

@ViewScoped
@ManagedBean
public class UsuarioEdit extends AbstractBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7779155604704232174L;

	private UsuarioService usuarioService = new UsuarioServiceImpl();

	private Usuario usuario;

	public void init() {
		try {
			if (usuario == null) {
				// Criando novo usuário
				usuario = new Usuario();
			} else {
				// Editando usuário já existente
				if (isEdicaoDeUsuario()) {
					usuarioService.update(usuario, false);
				} else {
					usuarioService.save(usuario);
				}
			}
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
		}
	}

	public String saveUsuario() {
		try {
			if (isEdicaoDeUsuario()) {
				usuarioService.update(usuario, false);
			} else {
				usuarioService.save(usuario);
			}
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}

		reportarMensagemDeSucesso("User '" + usuario.getNome() + "' saved");

		return EnderecoPaginas.PAGINA_PRINCIPAL_USUARIO;
	}

	public boolean isEdicaoDeUsuario() {
		return usuario != null && usuario.getId() != null;
	}

	public boolean isAdmin() {
		return usuario != null && usuario.getGroup() == Group.ADMIN;
	}

	public boolean isFuncionario() {
		return usuario != null && usuario.getGroup() == Group.FUNCIONARIO;
	}

	public boolean isCliente() {
		return usuario != null && usuario.getGroup() == Group.CLIENTE;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void checarDisponibilidadeLogin() {
		try {
			usuarioService.validarLogin(usuario);
			reportarMensagemDeSucesso(String.format("Login '%s' is available.", usuario.getLogin()));
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
		}
	}

}
