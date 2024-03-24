package main;

public class CurrentConditionsDisplay implements DisplayElement, WeatherObserver {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherData wd) {
        wd.registerObserver((WeatherObserver)this);
    }
    @Override
    public void update(float newTemperature, float newHumidity, float newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;
    }

    @Override
    public String display() {
        return String.format(
            "Current conditions: %.1fF degrees, %.1f%% humidity and %.1fPSI pressure",
            temperature, humidity, pressure
        );
    }
    
}
