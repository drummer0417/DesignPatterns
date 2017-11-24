package nl.androidappfactory.designpatterns.solid.openclose.right.with.strategypattern;

public class SortManager {

	public void sort(Sorter sorter) {

		sorter.sort();
	}
}
