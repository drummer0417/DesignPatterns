package nl.androidappfactory.designpatterns.nullobject;

public class CustomerFactory {

	private Database database;

	public CustomerFactory() {

		this.database = new Database();

	}

	public AbstractCustomer getCustomer(String name) {

		if (checkName(name)) {
			return new RealCustomer(name);
		} else
			return new NullCustomer();
	}

	private boolean checkName(String name) {

		return database.existCustomer(name);
	}
}
