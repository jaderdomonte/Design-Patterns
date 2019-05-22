package chapter.three.state;

public class RecordState implements LoopState {

	@Override
	public void click(LoopPedal loopPedal) {
		System.out.println("Stop loop!");
		loopPedal.setState(new StopState());
	}
}
