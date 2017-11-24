package nl.androidappfactory.designpatterns.strategy;

public class Add implements Strategy {

	@Override
	public void operation(int num1, int num2) {

		System.out.println("Add: " + (num1 + num2));

	}

}
