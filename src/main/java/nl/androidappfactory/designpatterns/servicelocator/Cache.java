package nl.androidappfactory.designpatterns.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> listOfServices;

	public Cache() {

		listOfServices = new ArrayList<>();
	}

	public Service getService(String jndiName) {

		for (Service service : listOfServices) {
			if (service.getName().equals(jndiName)) {
				return service;
			}
		}
		return null;
	}

	public void addService(Service newService) {
		if (newService != null) {

			boolean exists = false;

			for (Service service : listOfServices) {
				if (service.getName().equalsIgnoreCase(newService.getName())) {
					exists = true;
				}
			}
			System.out.println("Adding service to cache");
			if (!exists) {
				listOfServices.add(newService);
			}
		} else {
			throw new IllegalArgumentException("Service cannot be null");
		}
	}
}
