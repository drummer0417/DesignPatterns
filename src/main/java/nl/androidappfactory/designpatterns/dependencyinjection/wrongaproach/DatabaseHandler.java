package nl.androidappfactory.designpatterns.dependencyinjection.wrongaproach;

public class DatabaseHandler {

	MySqlDatabase mySqlDatabase;

	public DatabaseHandler() {

		mySqlDatabase = new MySqlDatabase();
	}

	public void connect() {
		this.mySqlDatabase.connect();
	}

	public void disConnect() {
		this.mySqlDatabase.disConnect();
	}

}
