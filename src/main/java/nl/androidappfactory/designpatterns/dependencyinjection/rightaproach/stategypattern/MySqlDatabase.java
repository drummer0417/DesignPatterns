package nl.androidappfactory.designpatterns.dependencyinjection.rightaproach.stategypattern;

public class MySqlDatabase implements Database {

	@Override
	public void connect() {

		System.out.println("Connect to the MySql DB: ");

	}

	@Override
	public void disconnect() {

		System.out.println("Disconnect from the MySql DB: ");
	}

}
