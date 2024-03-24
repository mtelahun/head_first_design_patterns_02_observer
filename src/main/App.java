package main;
public class App {
    private static WeatherData weatherData;
    private static CurrentConditionsDisplay currentDisplay;
    private static ForcastDisplay forcastDisplay;
    private static StatisticsDisplay statsDisplay;

    public static void main(String[] args) throws Exception {
        weatherData = new WeatherData();
        currentDisplay = new CurrentConditionsDisplay(weatherData);
        forcastDisplay = new ForcastDisplay(weatherData);
        statsDisplay = new StatisticsDisplay(weatherData);

        App.setMeasurementsAndDisplay(80f, 65f, 30.4f);
        App.setMeasurementsAndDisplay(82f, 70f, 29.2f);
        App.setMeasurementsAndDisplay(78f, 90f, 29.2f);
    }

    private static void setMeasurementsAndDisplay(float newTemperature, float newHumidity, float newPressure) {
        weatherData.setMeasurements(newTemperature, newHumidity, newPressure);
        String displayCurrent = currentDisplay.display();
        String displayStats = statsDisplay.display();
        String displayForcast = forcastDisplay.display();
        System.out.println(displayCurrent);
        System.out.println(displayStats);
        System.out.println(displayForcast);
    }
}
