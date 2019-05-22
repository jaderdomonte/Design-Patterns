package chapter.three.bridge;

public class JSONFileGenenator extends FileGenerator {

	public JSONFileGenenator() {
		super();
	}

	public JSONFileGenenator(PosProcessor posProcessor) {
		super(posProcessor);
	}

	@Override
	protected void format() {
		System.out.println("Formating something in JSON...");
	}
}
