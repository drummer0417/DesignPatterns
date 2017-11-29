package nl.androidappfactory.designpatterns.servicelocator;

public class MessagingService implements Service {

	public final static String NAME = "messagingService";

	@Override
	public String getName() {

		return DatabaseService.NAME;
	}

	@Override
	public void excecute() {

		System.out.println("Excecuting messaging service... ");
	}
}
