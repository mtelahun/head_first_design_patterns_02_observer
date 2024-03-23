package main;

import java.util.ArrayList;

public class WeatherData implements WeatherSubject {

    ArrayList<WeatherObserver> observers;

    public WeatherData() {
        observers = new ArrayList<WeatherObserver>();
    }

    public ArrayList<WeatherObserver> observerList() {
        return observers;
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }
    
}
