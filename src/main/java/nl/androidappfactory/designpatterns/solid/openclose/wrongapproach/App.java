package nl.androidappfactory.designpatterns.solid.openclose.wrongapproach;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Wrong Aproach");
		SortManager sm = new SortManager();

		sm.sort(new InsertionSort());

		sm.sort(new MergeSorter());
	}
}
