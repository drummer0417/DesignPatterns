package nl.androidappfactory.designpatterns.builder;

public class App {

	public static void main(String[] args) {

		Person person = new Person.Builder("Hans", "van Meurs", "hans@androidappfactory.nl")
				.setAddress("Fransebaan 511").setAge(56).setEducation("AMBI").build();

		System.out.println("build: " + person);

	}

}
