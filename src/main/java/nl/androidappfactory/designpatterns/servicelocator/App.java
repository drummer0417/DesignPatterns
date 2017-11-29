package nl.androidappfactory.designpatterns.servicelocator;

public class App {

	public static void main(String[] args) {

		System.out.println("\nGet databaseService: ");
		Service service = ServiceLocator.getService("databaseService");
		runService(service);

		System.out.println("\nGet databaseService: ");
		service = ServiceLocator.getService("databaseService");
		runService(service);

		System.out.println("\nGet messagingService: ");
		service = ServiceLocator.getService("messagingService");
		runService(service);

		System.out.println("\nGet unknownService: ");
		service = ServiceLocator.getService("unknownService");
		runService(service);
	}

	private static void runService(Service service) {

		if (service != null) {
			service.excecute();
		} else {
			System.out.println("Service not found");
		}
	}
}
