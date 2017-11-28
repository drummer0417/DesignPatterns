package nl.androidappfactory.designpatterns.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);

	}

	@Override
	public void assemble() {

		super.assemble();
		System.out.println("Adding features for a luxury car: ");
	}
}
