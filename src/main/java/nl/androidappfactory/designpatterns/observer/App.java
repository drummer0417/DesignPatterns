package nl.androidappfactory.designpatterns.observer;

import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) {

		// create weatherStation
		WeatherStation weatherStation = new WeatherStation();

		// create 2 observers
		Observer observer1 = new WeatherObserver(weatherStation, "Hans");
		Observer observer2 = new WeatherObserver(weatherStation, "Jacky");
		Observer observer3 = new WeatherObserver(weatherStation, "Cas & Anouk");

		try {

			weatherStation.setTemperature(23);

			TimeUnit.SECONDS.sleep(4);
			weatherStation.setTemperature(25);

			TimeUnit.SECONDS.sleep(3);
			weatherStation.setTemperature(18);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("done: \n" + observer1 + "\n" + observer2);
	}

}
