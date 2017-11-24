package nl.androidappfactory.designpatterns.solid.openclose.wrongapproach;

public class MergeSorter extends Sorter {

	public MergeSorter() {

		super.type = SortType.MERGESORT;
	}

	@Override
	public void sort() {
		System.out.println("Sorting using MergeSort: ");

	}

}
