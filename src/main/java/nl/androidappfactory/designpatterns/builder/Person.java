package nl.androidappfactory.designpatterns.builder;

public class Person {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private String address;
	private String education;

	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.age = builder.age;
		this.address = builder.address;
		this.education = builder.education;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
				+ ", address=" + address + ", education=" + education + "]";
	}

	public static class Builder {

		private final String firstName;
		private final String lastName;
		private final String email;
		private int age;
		private String address;
		private String education;

		public Builder(String firstName, String lastName, String email) {

			if (firstName == null || firstName.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()
					|| email == null || email.trim().isEmpty()) {
				throw new IllegalArgumentException("FirstName, lastName and email are mandatory");
			}
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setEducation(String education) {
			this.education = education;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
