package nl.androidappfactory.designpatterns.nullobject;

public class NullCustomer extends AbstractCustomer {

	@Override
	public boolean isNull() {

		return true;
	}

	@Override
	public String getCustomer() {

		return "No customer with given name exists in DB";
	}

}