package main;
public interface WeatherSubject {

    public void registerObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);

    public void setMeasurements(float temperature, float humidity, float pressure);

    public void notifyObservers();
}
