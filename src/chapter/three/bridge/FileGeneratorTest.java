package chapter.three.bridge;

public class FileGeneratorTest {

	public static void main(String[] args) {
		FileGenerator xmlPackageGenerator = new XMLFileGenerator(new PackagePosProcessor());
		xmlPackageGenerator.generateFile();
		
		System.out.println();
		
		FileGenerator jsonNullGenarator = new JSONFileGenenator();
		jsonNullGenarator.generateFile();
		
		System.out.println();
		
		jsonNullGenarator.setPosProcessor(new EncryptPosProcessor());
		jsonNullGenarator.generateFile();
	}
}
