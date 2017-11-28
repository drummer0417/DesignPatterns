package nl.androidappfactory.designpatterns.visitor3;

public interface Visitor {

	public double visit(Car car);

	public double visit(TouringCar touringCar);

	public double visit(Truck truck);

	public double visit(Bicycle bicycle);

}
