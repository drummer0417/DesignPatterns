package nl.androidappfactory.designpatterns.strategy;

public class Multiply implements Strategy {

	@Override
	public void operation(int num1, int num2) {

		System.out.println("Multiply: " + (num1 * num2));

	}

}
