package nl.androidappfactory.designpatterns.solid.openclose.right.with.strategypattern;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Right Aproach");
		SortManager sm = new SortManager();

		sm.sort(new InsertionSort());

		sm.sort(new MergeSorter());
	}
}
