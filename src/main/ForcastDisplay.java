package main;

public class ForcastDisplay implements DisplayElement, WeatherObserver {

    private WeatherData weatherData;

    public ForcastDisplay(WeatherData wd) {
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
