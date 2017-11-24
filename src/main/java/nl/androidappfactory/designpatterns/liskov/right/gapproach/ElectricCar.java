package nl.androidappfactory.designpatterns.liskov.right.gapproach;

public class ElectricCar implements ElectricVehicle {

	@Override
	public void speed() {
		System.out.println("Speed up the car: ");

	}

	@Override
	public void loadBattery() {
		System.out.println("Load the battery: ");

	}

}
