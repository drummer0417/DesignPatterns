package nl.androidappfactory.designpatterns.liskov.wrongapproach;

public class App {

	public static void main(String[] args) {

		Vehicle car = new Car();

		Vehicle eCar = new ElectricCar();

		car.speed();
		eCar.speed();

		System.out.println("\n\n");
		addFual(car);
		addFual(eCar);

	}

	private static void addFual(Vehicle v) {

		if (v instanceof ElectricCar) {
			System.out.println("You cannot add fual to electric car: ");
		} else {
			v.addFual();
		}
	}
}
