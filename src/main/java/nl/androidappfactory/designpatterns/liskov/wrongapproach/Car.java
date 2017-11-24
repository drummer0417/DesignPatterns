package nl.androidappfactory.designpatterns.liskov.wrongapproach;

public class Car implements Vehicle {

	@Override
	public void speed() {

		System.out.println("Speed up the car: ");

	}

	@Override
	public void addFual() {

		System.out.println("Add some fual to the car: ");
	}

}
