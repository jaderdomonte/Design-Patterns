package chapter.three.bridge;

public abstract class FileGenerator {

	private PosProcessor posProcessor;
	
	public FileGenerator() {}

	public FileGenerator(PosProcessor posProcessor) {
		this.posProcessor = posProcessor;
	}

	public final void generateFile() {
		System.out.println("Generating File...");
		posProcess();
		format();
	}
	
	protected abstract void format();

	protected void setPosProcessor(PosProcessor posProcessor) {
		this.posProcessor = posProcessor;
	}
	
	private void posProcess() {
		if(posProcessor == null) {
			return;
		}
		
		posProcessor.process();
	}
}
