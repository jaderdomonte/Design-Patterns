package chapter.three.state;

public class StopState implements LoopState {

	@Override
	public void click(LoopPedal loopPedal) {
		System.out.println("Recording something...");
		loopPedal.setState(new PlayState());
	}
}
