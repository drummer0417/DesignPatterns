package nl.androidappfactory.designpatterns.dependencyinjection.wrongaproach;

public class App {

	public static void main(String[] args) {

		DatabaseHandler databaseManager = new DatabaseHandler();

		databaseManager.connect();

		databaseManager.disConnect();

	}
}
