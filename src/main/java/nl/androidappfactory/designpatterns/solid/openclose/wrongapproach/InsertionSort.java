package nl.androidappfactory.designpatterns.solid.openclose.wrongapproach;

public class InsertionSort extends Sorter {

	public InsertionSort() {
		super.type = SortType.INSERTIONSORT;

	}

	@Override
	public void sort() {
		System.out.println("Sorting using InsertionSort: ");

	}

}
