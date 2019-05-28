package chapter.eight.command;

import java.util.List;

public class TamanhoParaDownload implements ComandoCarrinho, CienteDosProdutos {

	private List<Produto> produtos;

	public void setListaProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Object executar() {
		double tamanho = 0;
		for (Produto p : produtos) {
			if (p.isDigital()) {
				tamanho += p.getTamanhoDownload();
			}
		}
		
		return tamanho;
	}
}
