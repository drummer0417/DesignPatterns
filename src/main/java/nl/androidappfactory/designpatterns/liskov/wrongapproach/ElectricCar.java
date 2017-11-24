package nl.androidappfactory.designpatterns.liskov.wrongapproach;

public class ElectricCar implements Vehicle {

	@Override
	public void speed() {
		System.out.println("Speed up the car: ");

	}

	@Override
	public void addFual() {
		throw new RuntimeException("This is foolish: ");

	}

}
