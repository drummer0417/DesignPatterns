package nl.androidappfactory.designpatterns.liskov.right.gapproach;

public class NormalCar implements NormalVehicle {

	@Override
	public void speed() {

		System.out.println("Speed up the car: ");

	}

	@Override
	public void addFual() {

		System.out.println("Add some fual to the car: ");
	}

}
