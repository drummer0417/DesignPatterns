package nl.androidappfactory.designpatterns.dependencyinjection.wrongaproach;

public class MySqlDatabase {

	public void connect() {

		System.out.println("Connect to db: ");

	}

	public void disConnect() {

		System.out.println("Disonnect from db: ");

	}

}
