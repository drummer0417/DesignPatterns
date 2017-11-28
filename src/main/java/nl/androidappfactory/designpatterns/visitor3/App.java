package nl.androidappfactory.designpatterns.visitor3;

public class App {

	public static void main(String[] args) {

		Visitor roadTaxCalculator = new RoadTaxCalculator();

		Visitable bicycle = new Bicycle(20);
		System.out.println("The roadtax for this bicycle is: " + bicycle.accept(roadTaxCalculator));

		Visitable car = new Car(1200);
		System.out.println("The roadtax for this car is: " + car.accept(roadTaxCalculator));

		Visitable touringCar = new TouringCar(8000);
		System.out.println("The roadtax for this touringcar is: " + touringCar.accept(roadTaxCalculator));

		Visitable truck = new Truck(20000);
		System.out.println("The roadtax for this truck is: " + truck.accept(roadTaxCalculator));

	}
}
