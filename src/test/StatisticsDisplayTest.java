package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.DisplayElement;
import main.StatisticsDisplay;
import main.WeatherData;
import main.WeatherObserver;

public class StatisticsDisplayTest {
    @Test
    public void givenDisplayElement_WhenConstructorGivenWeatherData_ThenRegistersItselfAsObserver() {
        // Arrange
        WeatherData wd = new WeatherData();

        // Act
        DisplayElement display = new StatisticsDisplay(wd);

        // Assert
        ArrayList<WeatherObserver> olist = wd.getObservers();
        assertEquals(1, olist.size());
        assertEquals((WeatherObserver)display, olist.get(0));

    }

    @Test
    public void givenRegisteredDisplayWith2WeatherMeasurements_WhenNewMeasurement_ThenDisplayAvgMaxMin() {
        // Arrange
        WeatherData wd = new WeatherData();
        StatisticsDisplay display = new StatisticsDisplay(wd);
        wd.setMeasurements(82.0f, 70f, 29.2f);
        wd.setMeasurements(61f, 70f, 29.2f);

        // Act
        wd.setMeasurements(55.5f, 70f, 29.2f);

        // Assert
        String result = display.display(); 
        assertEquals("Avg/Max/Min temperature = 66.2/82.0/55.5", result);
    }    

    @Test
    public void givenRegisteredDisplay_WhenNewMeasurement_ThenSetBothMinAndMax() {
        // Arrange
        WeatherData wd = new WeatherData();
        StatisticsDisplay display = new StatisticsDisplay(wd);

        // Act
        wd.setMeasurements(55.5f, 70f, 29.2f);

        // Assert
        String result = display.display();
        assertEquals("Avg/Max/Min temperature = 55.5/55.5/55.5", result);
    }
}
