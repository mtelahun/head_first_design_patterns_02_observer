package main;

import java.util.ArrayList;

public class WeatherData implements WeatherSubject {

    private float temperature;
    
    public float getTemperature() {
        return temperature;
    }

    private float humidity;

    public float getHumidity() {
        return humidity;
    }

    private float pressure;

    public float getPressure() {
        return pressure;
    }

    private ArrayList<WeatherObserver> observers;

    public ArrayList<WeatherObserver> getObservers() {
        return observers;
    }

    public WeatherData() {
        observers = new ArrayList<WeatherObserver>();
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
            observer.update();
        });
    }
    
}
