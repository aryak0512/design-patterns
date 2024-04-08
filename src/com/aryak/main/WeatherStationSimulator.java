package com.aryak.main;

import com.aryak.observer.WeatherData;
import com.aryak.observer.displays.CurrentConditionsDisplay;
import com.aryak.observer.displays.DisplayElement;

public class WeatherStationSimulator {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		DisplayElement currentConditions = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
