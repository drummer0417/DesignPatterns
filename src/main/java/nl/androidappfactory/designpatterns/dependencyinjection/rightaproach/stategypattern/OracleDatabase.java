package nl.androidappfactory.designpatterns.dependencyinjection.rightaproach.stategypattern;

public class OracleDatabase implements Database {

	@Override
	public void connect() {

		System.out.println("Connect to the Oracle DB: ");

	}

	@Override
	public void disconnect() {

		System.out.println("Disconnect from the Oracle DB: ");
	}

}
