package chapter.three.state;

public class LoopPedalTest {

	public static void main(String[] args) {
		LoopPedal loopPedal = new LoopPedal();
		
		for(int i=0; i<4; i++) {
			loopPedal.click();
			System.out.println();
		}
	}
}
