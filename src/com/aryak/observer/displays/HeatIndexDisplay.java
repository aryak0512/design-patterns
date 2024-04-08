package com.aryak.observer.displays;

import com.aryak.observer.Observer;
import com.aryak.observer.Subject;

public class HeatIndexDisplay implements DisplayElement, Observer {
	
	private float humidity;
	private float pressure;
	private float temprature;
	private Subject weatherData;

	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float tempature, float humidity, float pressure) {
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
