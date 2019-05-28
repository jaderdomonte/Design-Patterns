package chapter.eight.command;

public class UsuarioCompra implements ComandoCarrinho, CienteDoUsuario {
	
	private Usuario usuario;

	@Override
	public Object executar() {
		return new String("Acionando cart�o de cr�dito do usu�rio "+usuario.getNome());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
