package chapter.five.staticfactorymethod;

public class AutomobileFactory {

	public static Automobile createTouringCar() {
		return new TouringCar();
	}
	
	public static Automobile createTruck() {
		return new Truck();
	}
}
