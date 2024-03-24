package main;
public interface WeatherSubject {

    public void registerObserver(WeatherObserver observer);

    public void removeObserver(WeatherObserver observer);
}
