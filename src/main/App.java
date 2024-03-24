package main;
public class App {
    public static void main(String[] args) throws Exception {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        String result = currentDisplay.display();
        System.out.println(result);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        String result2 = currentDisplay.display();
        System.out.println(result2);
        weatherData.setMeasurements(78f, 90f, 29.2f);
        String result3 = currentDisplay.display();
        System.out.println(result3);
    }
}
