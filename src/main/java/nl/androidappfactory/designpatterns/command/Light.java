package nl.androidappfactory.designpatterns.command;

/**
 * 
 * This is the Receiver
 *
 */
public class Light {

	private String status;

	public void turnOn() {
		status = "On";
	}

	public void turnOff() {
		status = "Off";
	}

	public String getStatus() {
		return status;
	}
}
