package nl.androidappfactory.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private int temperature;

	private List<Observer> observers;

	public WeatherStation() {

		this.observers = new ArrayList<>();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		this.notifyAllObservers();
	}

	@Override
	public void addObserver(Observer observer) {

		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {

		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers() {

		for (Observer observer : observers) {
			observer.update(this.temperature);
		}
	}
}
