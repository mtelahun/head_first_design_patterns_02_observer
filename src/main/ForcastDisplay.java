package main;

public class ForcastDisplay implements DisplayElement, WeatherObserver {

    private WeatherData weatherData;
    private float previousPressure;
    private float currentPressure;

    public ForcastDisplay(WeatherData wd) {
        wd.registerObserver((WeatherObserver)this);
        weatherData = wd;
    }

    @Override
    public void update() {
        previousPressure = currentPressure;
        currentPressure = weatherData.getPressure();
    }

    @Override
    public String display() {
        String heading = "Forcast";
        if (currentPressure > previousPressure) {
            return String.format(
                "%s: Improving weather on the way!",
                heading
            );
        } else if (currentPressure < previousPressure) {
            return String.format(
                    "%s: Watch out for cooler, rainy weather",
                    heading);
        } else {
            return String.format(
                    "%s: More of the same",
                    heading);
        }
    }
    
}
