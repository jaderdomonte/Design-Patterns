package chapter.eight.doubledispatch;

public class Detran {
	
	private RG rg;
	
	private ComprovanteDeResidencia comprovanteDeResidencia;
	
	public void emitirCNH(DespachanteDetran despachante) {
		System.out.println("Emitindo CNH");
		despachante.solicitaServico(this);
	}
	
	public void emitirCertidaoPontosCNH(DespachanteDetran despachante) {
		System.out.println("Emitindo Certidão Pontos Carteira");
		despachante.solicitaServico(this);
	}

	public RG getRg() {
		return rg;
	}

	public void setRg(RG rg) {
		System.out.println("Fornecendo RG");
		this.rg = rg;
	}

	public ComprovanteDeResidencia getComprovanteDeResidencia() {
		return comprovanteDeResidencia;
	}

	public void setComprovanteDeResidencia(ComprovanteDeResidencia comprovanteDeResidencia) {
		System.out.println("Fornecendo Comprovante de Residência");
		this.comprovanteDeResidencia = comprovanteDeResidencia;
	}
}
