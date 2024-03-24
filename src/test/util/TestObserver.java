package test.util;

import main.WeatherObserver;

public class TestObserver implements WeatherObserver {
    float temperature;
    float humidity;
    float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void update(float temp, float humidity, float pressure) {}
}
