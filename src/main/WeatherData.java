package main;

import java.util.ArrayList;

public class WeatherData implements WeatherSubject {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<WeatherObserver> observers;

    public WeatherData() {
        observers = new ArrayList<WeatherObserver>();
    }

    public ArrayList<WeatherObserver> observerList() {
        return observers;
    }

    public void setMeasurements(float newTemperature, float newHumidity, float newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;

        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temperature, humidity, pressure);
        });
    }
    
}
