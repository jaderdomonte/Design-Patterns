package chapter.five.staticfactorymethod;

public class Truck implements Automobile {

	Truck() {}

	@Override
	public void turnOn() {
		System.out.println("Turn on truck");
	}
}
