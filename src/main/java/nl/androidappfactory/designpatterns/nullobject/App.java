package nl.androidappfactory.designpatterns.nullobject;

public class App {

	public static void main(String[] args) {

		CustomerFactory customerFactory = new CustomerFactory();

		System.out.println("Customer: " + customerFactory.getCustomer("Hans").getCustomer());
		System.out.println("Customer: " + customerFactory.getCustomer("Jacky").getCustomer());
		System.out.println("Customer: " + customerFactory.getCustomer("Aap").getCustomer());
		System.out.println("Customer: " + customerFactory.getCustomer("Cas").getCustomer());
		System.out.println("Customer: " + customerFactory.getCustomer("Anouk").getCustomer());

	}

}
