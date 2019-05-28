package chapter.eight.doubledispatch;

public class DespachanteAutonomo implements DespachanteDetran {

	@Override
	public void solicitaServico(Detran detran) {
		detran.setRg(new RG("12.345.678-90"));
	}
}
