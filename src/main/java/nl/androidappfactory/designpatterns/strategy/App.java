package nl.androidappfactory.designpatterns.strategy;

public class App {

	public static void main(String[] args) {

		Manager manager = new Manager();

		manager.setStrategy(new Add());
		manager.operation(3, 7);

		manager.setStrategy(new Multiply());
		manager.operation(3, 7);

	}

}
