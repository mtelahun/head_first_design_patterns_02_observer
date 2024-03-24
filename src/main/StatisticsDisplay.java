package main;

public class StatisticsDisplay implements DisplayElement, WeatherObserver {

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData wd) {
        wd.registerObserver((WeatherObserver)this);
        weatherData = wd;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    
}
