package chapter.three.bridge;

public class XMLFileGenerator extends FileGenerator {

	public XMLFileGenerator() {
		super();
	}

	public XMLFileGenerator(PosProcessor posProcessor) {
		super(posProcessor);
	}

	@Override
	protected void format() {
		System.out.println("Formating something in XML...");
	}
}
