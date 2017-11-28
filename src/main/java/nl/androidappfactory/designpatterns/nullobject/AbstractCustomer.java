package nl.androidappfactory.designpatterns.nullobject;

public abstract class AbstractCustomer {

	protected String personName;

	public abstract boolean isNull();

	public abstract String getCustomer();

	@Override
	public String toString() {
		return "AbstractCustomer [Name=" + personName + "]";
	}

}
