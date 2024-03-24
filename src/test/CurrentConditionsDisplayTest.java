package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.CurrentConditionsDisplay;
import main.DisplayElement;
import main.WeatherData;
import main.WeatherObserver;
import test.util.TestObserver;

public class CurrentConditionsDisplayTest {
    @Test
    public void givenDisplayElement_WhenConstructorGivenWeatherData_ThenRegistersItselfAsObserver() {
        // Arrange
        WeatherData wd = new WeatherData();

        // Act
        DisplayElement display = new CurrentConditionsDisplay(wd);

        // Assert
        ArrayList<WeatherObserver> olist = wd.observerList();
        assertEquals(1, olist.size());
        assertEquals((WeatherObserver)display, olist.get(0));

    }

    @Test
    public void givenRegisteredDisplay_WhenWeatherDataUpdated_ThenDisplayUpdated() {
        // Arrange
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(wd);

        // Act
        wd.setMeasurements(25.0f, 45.2f, 30.0f);

        // Assert
        String result = display.display(); 
        assertEquals("Current conditions: 25.0F degrees, 45.2% humidity and 30.0PSI pressure", result);
    }    
}
