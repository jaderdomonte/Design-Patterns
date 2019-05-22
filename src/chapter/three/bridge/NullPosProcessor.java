package chapter.three.bridge;

public class NullPosProcessor implements PosProcessor {

	@Override
	public void process() {
		System.out.println("Without Pos Processing...");
	}
}
