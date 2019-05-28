package chapter.eight.doubledispatch;

public class DetranTest {

	public static void main(String[] args) {
		Detran detran = new Detran();
		DespachanteDetran despachanteAutonomo = new DespachanteAutonomo();
		DespachanteDetran despachantePJ = new DespachantePJ();
		
		detran.emitirCNH(despachanteAutonomo);
		detran.emitirCertidaoPontosCNH(despachantePJ);
	}
}
