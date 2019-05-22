package chapter.three.bridge;

public class EncryptPosProcessor implements PosProcessor {

	@Override
	public void process() {
		System.out.println("Encrypt something...");
	}
}
