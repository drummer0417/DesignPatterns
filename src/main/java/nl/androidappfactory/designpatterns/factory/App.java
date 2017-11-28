package nl.androidappfactory.designpatterns.factory;

public class App {

	public final static void main(String[] args) {

		Algorithm spanningTree = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SPANNING_TREE);

		Algorithm shortestPath = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SHORTEST_PATH);

		System.out.println("spanningTree: ");
		spanningTree.solve();

		System.out.println("shortestPath: ");
		shortestPath.solve();

		AlgorithmFactory.createAlgorithm(3);
	}
}
