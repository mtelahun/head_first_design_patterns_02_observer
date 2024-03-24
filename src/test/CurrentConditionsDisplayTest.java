package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.CurrentConditionsDisplay;
import main.DisplayElement;
import main.WeatherData;
import main.WeatherObserver;

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

    
}
