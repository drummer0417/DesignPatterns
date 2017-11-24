package nl.androidappfactory.designpatterns.liskov.right.gapproach;

public class App {

	public static void main(String[] args) {

		NormalVehicle car = new NormalCar();

		ElectricVehicle eCar = new ElectricCar();

		car.speed();
		eCar.speed();

		System.out.println("\n\n");
		car.addFual();
		eCar.loadBattery();

	}

}
