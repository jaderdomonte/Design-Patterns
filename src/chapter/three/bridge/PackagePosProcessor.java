package chapter.three.bridge;

public class PackagePosProcessor implements PosProcessor {

	@Override
	public void process() {
		System.out.println("Packaging something...");
	}
}
