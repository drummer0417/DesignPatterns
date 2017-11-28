package nl.androidappfactory.designpatterns.decorator;

public class App {

	public final static void main(String[] args) {

		System.out.println("\nFirst start with a basic car: ");
		Car car1 = new BasicCar();
		car1.assemble();

		System.out.println("\nA sports car now: ");
		Car car2 = new SportsCar(new BasicCar());
		car2.assemble();

		System.out.println("\nA luxury car now: ");
		Car car3 = new LuxuryCar(new BasicCar());
		car2.assemble();

		System.out.println("\nA luxury sports car now: ");
		Car car4 = new LuxuryCar(new SportsCar(new BasicCar()));
		car4.assemble();

	}
}
