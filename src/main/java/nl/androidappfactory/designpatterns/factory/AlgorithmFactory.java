package nl.androidappfactory.designpatterns.factory;

public class AlgorithmFactory {

	public final static int SHORTEST_PATH = 0;
	public final static int SPANNING_TREE = 1;

	public static Algorithm createAlgorithm(int algorithm) {

		switch (algorithm) {
		case SHORTEST_PATH:
			return new ShortestPath();

		case SPANNING_TREE:
			return new SpanningTree();

		default:
			throw new IllegalArgumentException("Invalid algoritm: " + algorithm);
		}
	}
}
