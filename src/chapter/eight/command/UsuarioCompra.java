package chapter.eight.command;

public class UsuarioCompra implements ComandoCarrinho, CienteDoUsuario {
	
	private Usuario usuario;

	@Override
	public Object executar() {
		return new String("Acionando cartão de crédito do usuário "+usuario.getNome());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
