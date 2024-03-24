package main;

public class CurrentConditionsDisplay implements DisplayElement, WeatherObserver {

    public CurrentConditionsDisplay(WeatherData wd) {
        wd.registerObserver((WeatherObserver)this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public String display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    
}
