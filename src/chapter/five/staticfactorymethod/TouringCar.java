package chapter.five.staticfactorymethod;

public class TouringCar implements Automobile {
	
	TouringCar(){}

	@Override
	public void turnOn() {
		System.out.println("Turn on touring car");
	}
}
