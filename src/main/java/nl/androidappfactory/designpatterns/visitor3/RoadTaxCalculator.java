package nl.androidappfactory.designpatterns.visitor3;

public class RoadTaxCalculator implements Visitor {

	/**
	 * A car has a tax factor of 1.25 / kilo
	 */
	@Override
	public double visit(Car car) {

		return car.getWeight() * 1.25;
	}

	/**
	 * A touringcar has a tax factor of 0.8 / kilo
	 */
	@Override
	public double visit(TouringCar touringCar) {

		return touringCar.getWeight() * 0.8;
	}

	/**
	 * A truck has a tax factor of 1.1 / kilo
	 */
	@Override
	public double visit(Truck truck) {

		return truck.getWeight() * 0.33;
	}

	/**
	 * A bicycle has a tax factor of 0 / kilo
	 */
	@Override
	public double visit(Bicycle bicycle) {
		return bicycle.getWeight() * 0;
	}

}
