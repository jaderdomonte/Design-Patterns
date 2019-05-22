package chapter.three.state;

public class PlayState implements LoopState {

	@Override
	public void click(LoopPedal loopPedal) {
		System.out.println("Playing something...");
		loopPedal.setState(new RecordState());
	}
}
