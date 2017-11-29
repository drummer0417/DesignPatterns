package nl.androidappfactory.designpatterns.servicelocator;

public class ServiceLocator {

	private static Cache cache = new Cache();

	private ServiceLocator() {}

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);
		if (service != null) {
			System.out.println("Service found in cache ");
			return service;
		}

		System.out.println("Service not found in cache ");

		InitialContext context = new InitialContext();
		service = (Service) context.lookup(jndiName);
		if (service != null) {
			System.out.println("Service returned by context ");
			cache.addService(service);
		} else {
			System.out.println("Service not found in context ");
		}
		return service;
	}

}
