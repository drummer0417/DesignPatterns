package nl.androidappfactory.designpatterns.dependencyinjection.rightaproach.stategypattern;

public class App {

	public static void main(String[] args) {

		// create handler by injecting Oracle db
		DatabaseHandler databaseHandler1 = new DatabaseHandler(new OracleDatabase());

		databaseHandler1.connect();
		databaseHandler1.disconnect();

		// create handler by injecting MySql db
		DatabaseHandler databaseHandler2 = new DatabaseHandler(new MySqlDatabase());
		databaseHandler2.connect();
		databaseHandler2.disconnect();

	}
}
