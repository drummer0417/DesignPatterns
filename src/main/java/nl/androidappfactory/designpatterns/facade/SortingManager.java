package nl.androidappfactory.designpatterns.facade;

/**
 * 
 * This is the Facade class
 *
 */
public class SortingManager {

	private Algorithm bubbleSort;
	private Algorithm mergeSort;
	private Algorithm quickSort;

	public SortingManager() {

		bubbleSort = new BubbleSort();
		mergeSort = new MergeSort();
		quickSort = new QuickSort();
	}

	public void doBubbleSort() {
		bubbleSort.sort();
	}

	public void doMergeSort() {
		mergeSort.sort();
	}

	public void doQuickSort() {
		quickSort.sort();
	}

}
