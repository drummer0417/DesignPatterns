package nl.androidappfactory.designpatterns.servicelocator;

public class DatabaseService implements Service {

	public final static String NAME = "databaseService";

	@Override
	public String getName() {

		return DatabaseService.NAME;
	}

	@Override
	public void excecute() {

		System.out.println("Excecuting database service... ");
	}
}
