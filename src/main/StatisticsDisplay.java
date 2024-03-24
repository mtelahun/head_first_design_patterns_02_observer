package main;

public class StatisticsDisplay implements DisplayElement, WeatherObserver {

    private WeatherData weatherData;
    private int numReadings;
    private float sumTemperatures;
    private float minTemperature;
    private float maxTemperature;

    public StatisticsDisplay(WeatherData wd) {
        wd.registerObserver((WeatherObserver)this);
        weatherData = wd;
        minTemperature = 1000000f;
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        if (temperature < minTemperature) {
            minTemperature = temperature;
        }
        sumTemperatures += temperature;
        numReadings++;
    }

    @Override
    public String display() {
        return String.format(
            "Avg/Max/Min temperature = %.1f/%.1f/%.1f", 
            sumTemperatures / (float)numReadings, maxTemperature, minTemperature
        );
    }
    
}
