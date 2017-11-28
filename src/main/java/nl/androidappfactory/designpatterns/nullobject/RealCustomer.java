package nl.androidappfactory.designpatterns.nullobject;

public class RealCustomer extends AbstractCustomer {

	private String customerName;

	public RealCustomer(String name) {

		this.customerName = name;
	}

	@Override
	public boolean isNull() {

		return this.customerName == null;
	}

	@Override
	public String getCustomer() {

		return this.customerName;
	}

}
