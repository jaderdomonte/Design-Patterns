package chapter.five.staticfactorymethod;

public class StaticFactoryMethodTest {

	public static void main(String[] args) {
		Automobile touringCar = AutomobileFactory.createTouringCar();
		Automobile truck = AutomobileFactory.createTruck();
		
		touringCar.turnOn();
		truck.turnOn();
	}
}
