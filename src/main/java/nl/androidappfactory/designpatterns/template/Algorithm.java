package nl.androidappfactory.designpatterns.template;

public abstract class Algorithm {

	int[] numbers;

	protected abstract void initialize();

	protected abstract void sorting();

	void printResult() {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(i + ": " + numbers[i] + ", ");
		}
	}

	public void sort() {

		initialize();
		sorting();
		printResult();
	}

}
