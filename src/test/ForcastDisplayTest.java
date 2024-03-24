package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.DisplayElement;
import main.ForcastDisplay;
import main.WeatherData;
import main.WeatherObserver;

public class ForcastDisplayTest {
    @Test
    public void givenDisplayElement_WhenConstructorGivenWeatherData_ThenRegistersItselfAsObserver() {
        // Arrange
        WeatherData wd = new WeatherData();

        // Act
        DisplayElement display = new ForcastDisplay(wd);

        // Assert
        ArrayList<WeatherObserver> olist = wd.getObservers();
        assertEquals(1, olist.size());
        assertEquals((WeatherObserver)display, olist.get(0));

    }

    @Test
    public void givenRegisteredDisplayWithWeatherMeasurements_WhenNewPressureGreaterThanPrevious_ThenDisplayWeatherIsImproving() {
        // Arrange
        WeatherData wd = new WeatherData();
        ForcastDisplay display = new ForcastDisplay(wd);
        wd.setMeasurements(82.0f, 70f, 29.2f);

        // Act
        wd.setMeasurements(82.0f, 70f, 31.2f);

        // Assert
        String result = display.display(); 
        assertEquals("Forcast: Improving weather on the way!", result);
    }    
}
