package chapter.eight.doubledispatch;

public class DespachantePJ implements DespachanteDetran {

	@Override
	public void solicitaServico(Detran detran) {
		detran.setComprovanteDeResidencia(new ComprovanteDeResidencia("Rua As"));
	}
}
