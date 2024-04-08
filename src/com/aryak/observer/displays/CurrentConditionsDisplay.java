package com.aryak.observer.displays;

import com.aryak.observer.Observer;
import com.aryak.observer.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float humidity;
	private float pressure;
	private float temprature;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println(
				"Current conditions : Temp= " + temprature + ", Pressure = " + pressure + " , Humidity = " + humidity);
	}

	@Override
	public void update(float tempature, float humidity, float pressure) {
		
		this.humidity = humidity;
		this.pressure = pressure;
		this.temprature = tempature;
		display();

	}

}
