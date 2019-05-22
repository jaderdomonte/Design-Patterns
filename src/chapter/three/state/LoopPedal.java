package chapter.three.state;

public class LoopPedal {

	private LoopState state;

	public LoopPedal() {
		this.state = new StopState();
	}
	
	public void click() {
		System.out.println("Pedal has been clicked.");
		state.click(this);
	}

	public LoopState getState() {
		return state;
	}

	public void setState(LoopState state) {
		this.state = state;
	}
}
