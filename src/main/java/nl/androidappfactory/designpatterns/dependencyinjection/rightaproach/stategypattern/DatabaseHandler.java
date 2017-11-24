package nl.androidappfactory.designpatterns.dependencyinjection.rightaproach.stategypattern;

public class DatabaseHandler {

	Database database;

	public DatabaseHandler(Database database) {

		this.database = database;
	}

	public void connect() {
		this.database.connect();
	}

	public void disconnect() {
		this.database.disconnect();
	}

}
