package nl.androidappfactory.designpatterns.facade;

public class App {

	public static void main(String[] args) {

		SortingManager sortingManager = new SortingManager();

		sortingManager.doBubbleSort();
		sortingManager.doMergeSort();
		sortingManager.doQuickSort();
	}
}
