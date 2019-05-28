package chapter.eight.command;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarrinhoDeCompras {

	private Map<String, ComandoCarrinho> comandos;
	private List<Produto> produtos;
	private Usuario usuario;

	public CarrinhoDeCompras() {
	}

	public CarrinhoDeCompras(Map<String, ComandoCarrinho> comandos, List<Produto> produtos, Usuario usuario) {
		this.comandos = comandos;
		this.produtos = produtos;
		this.usuario = usuario;
	}

	public Object executaComando(String nomeComando) throws IllegalAccessError {
		ComandoCarrinho c = comandos.get(nomeComando);
		
		if (c == null)
			throw new IllegalAccessError();
		if (c instanceof CienteDosProdutos) {
			((CienteDosProdutos) c).setListaProdutos(produtos);
		}
		if (c instanceof CienteDoUsuario) {
			((CienteDoUsuario) c).setUsuario(usuario);
		}
		return c.executar();
	}

	public Map<String, ComandoCarrinho> getComandos() {
		return comandos;
	}

	public void setComandos(Map<String, ComandoCarrinho> comandos) {
		this.comandos = comandos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<String> getComandosDisponiveis() {
		return comandos.keySet();
	}
}
