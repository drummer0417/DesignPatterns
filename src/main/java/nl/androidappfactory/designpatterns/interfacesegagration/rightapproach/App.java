package nl.androidappfactory.designpatterns.interfacesegagration.rightapproach;

public class App {

	public static void main(String[] args) {

		ITree balancedTree = new BalancedTree();
		ITree binarySearchTree = new BinarySearchTree();

	}

}
