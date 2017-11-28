package nl.androidappfactory.designpatterns.template;

public class App {

	public static void main(String[] args) {

		int numbers[] = { 1, 33, 2, -2, -3, 49, 5 };

		Algorithm sorter = new BubbleSort(numbers);

		sorter.sort();

		int numbers2[] = { 1, 33, 2, -2, -3, 49, 5 };

		Algorithm sorter2 = new InsertionSort(numbers2);

		sorter2.sort();

	}
}
