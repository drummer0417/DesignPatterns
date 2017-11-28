package nl.androidappfactory.designpatterns.adapter;

public class App {

	public static void main(String[] args) {

		Vehicle biCycle = new BicycleAdapter(new Bicycle());
		Vehicle car = new Car();
		Vehicle bus = new Bus();

		biCycle.accelerate();
		car.accelerate();
		bus.accelerate();
	}
}
