package nl.androidappfactory.designpatterns.template;

public class InsertionSort extends Algorithm {

	public InsertionSort(int[] numbers) {

		this.numbers = numbers;
	}

	@Override
	public void initialize() {

		System.out.println("\nInitializing InsertionSort: ");
	}

	@Override
	public void sorting() {

		int temp;
		int j;

		for (int i = 1; i < this.numbers.length; i++) {

			temp = this.numbers[i];
			j = i;

			while (j > 0 && numbers[j - 1] > temp) {
				numbers[j] = numbers[j - 1];
				j = j - 1;
			}
			numbers[j] = temp;
		}
	}
}
