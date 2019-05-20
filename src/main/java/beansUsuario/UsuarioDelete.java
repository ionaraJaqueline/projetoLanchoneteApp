package beansUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;
import entities.Usuario;
import impl.UsuarioServiceImpl;
import service.ServiceDacException;
import service.UsuarioService;

@ViewScoped
@ManagedBean
public class UsuarioDelete extends AbstractBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4804260264032468336L;

	private Usuario usuario;

	private UsuarioService usuarioService = new UsuarioServiceImpl();

	public String delete() {
		try {
			usuarioService.delete(usuario);
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}

		reportarMensagemDeSucesso("User '" + usuario.getNome() + "' deleted");

		return EnderecoPaginas.PAGINA_PRINCIPAL_USUARIO;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
