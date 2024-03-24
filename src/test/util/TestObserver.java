package test.util;

import main.WeatherData;
import main.WeatherObserver;

public class TestObserver implements WeatherObserver {

    private WeatherData weatherData;

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

    public TestObserver(WeatherData weatherData) {
        weatherData.registerObserver((WeatherObserver)this);
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
    }
}
