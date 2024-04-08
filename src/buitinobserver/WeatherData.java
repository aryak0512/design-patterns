package buitinobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class WeatherData extends Observable {

	private List<Observer> observers;
	private float humidity;
	private float pressure;
	private float temprature;

	public WeatherData() {
		super();
		this.observers = new ArrayList<>();
	}

	public void measurementsChanged() {
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temprature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.notifyObservers();
	}

	@Override
	protected synchronized void setChanged() {
	
		super.setChanged();
	}

    
    
}
