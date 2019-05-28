package chapter.eight.command;

public class Produto {
	
	private double tamanhoDownload;
	
	private boolean digital;

	public Produto(double tamanhoDonwload, boolean digital) {
		this.tamanhoDownload = tamanhoDonwload;
		this.digital = digital;
	}

	public double getTamanhoDownload() {
		return tamanhoDownload;
	}

	public void setTamanhoDownload(double tamanhoDownload) {
		this.tamanhoDownload = tamanhoDownload;
	}

	public boolean isDigital() {
		return digital;
	}

	public void setDigital(boolean digital) {
		this.digital = digital;
	}
}
