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

	public void addService(Service service) {
		if (service != null) {
			System.out.println("Adding service to cache");
			listOfServices.add(service);
		} else {
			throw new IllegalArgumentException("Service cannot be null");
		}
	}
}
