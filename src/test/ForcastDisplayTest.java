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
}
