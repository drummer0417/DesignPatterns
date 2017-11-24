package nl.androidappfactory.designpatterns.observer;

public class WeatherObserver implements Observer {

	private int temperature;
	private String observerName;

	public WeatherObserver(Subject subject, String observerName) {

		this.observerName = observerName;
		subject.addObserver(this);
	}

	@Override
	public void update(int temperature) {

		this.temperature = temperature;
		System.out.println("Temp changed: " + this.toString());
	}

	@Override
	public String toString() {
		return "WeatherObserver [temperature=" + temperature + ", observerName=" + observerName + "]";
	}

}
