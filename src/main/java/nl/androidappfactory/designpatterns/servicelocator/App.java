package nl.androidappfactory.designpatterns.servicelocator;

public class App {

	public static void main(String[] args) {

		System.out.println("\nGet databaseService: ");
		Service service = ServiceLocator.getService("databaseService");
		showService(service);

		System.out.println("\nGet databaseService: ");
		service = ServiceLocator.getService("databaseService");
		showService(service);

		System.out.println("\nGet messagingService: ");
		service = ServiceLocator.getService("messagingService");
		showService(service);

		System.out.println("\nGet unknownService: ");
		service = ServiceLocator.getService("unknownService");
		showService(service);
	}

	private static void showService(Service service) {

		if (service != null) {
			System.out.println("Service found, name: " + service.getName());
		} else {
			System.out.println("Service not found");
		}
	}
}
