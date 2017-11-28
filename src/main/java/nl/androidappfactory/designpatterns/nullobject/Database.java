package nl.androidappfactory.designpatterns.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<String> customerNames;

	public Database() {

		customerNames = new ArrayList<>();
		customerNames.add("Jacky");
		customerNames.add("Cas");
		customerNames.add("Anouk");
		customerNames.add("Hans");
		customerNames.add("Pietje");
	}

	public boolean existCustomer(String name) {

		for (String customerName : customerNames) {
			if (customerName.equals(name)) {
				return true;
			}
		}
		return false;
	}
}
