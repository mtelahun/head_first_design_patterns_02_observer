package main;
public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        String resultCurrent = currentDisplay.display();
        String resultForcast = forcastDisplay.display();
        System.out.println(resultCurrent);
        System.out.println(resultForcast);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        String resultCurrent2 = currentDisplay.display();
        String resultForcast2 = forcastDisplay.display();
        System.out.println(resultCurrent2);
        System.out.println(resultForcast2);
        weatherData.setMeasurements(78f, 90f, 29.2f);
        String resultCurrent3 = currentDisplay.display();
        String resultForcast3 = forcastDisplay.display();
        System.out.println(resultCurrent3);
        System.out.println(resultForcast3);
    }
}
