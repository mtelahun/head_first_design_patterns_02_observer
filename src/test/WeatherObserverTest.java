package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import main.WeatherData;
import main.WeatherObserver;
import test.util.TestObserver;

public class WeatherObserverTest {
    @Test
    public void givenWeatherDataWhenRegisterObserverThenObserverInObserverList() {
        // Arrange
        WeatherObserver o = new TestObserver();
        WeatherData wd = new WeatherData();

        // Act
        wd.registerObserver(o);

        // Assert
        ArrayList<WeatherObserver> olist = wd.observerList();
        assertEquals(1, olist.size());
        assertEquals(o, olist.get(0));
    }
    
    @Test
    public void givenWeatherDataWithRegisteredObserverWhenObserverRemovedThenObserverNotInObserverList() {
        // Arrange
        WeatherObserver o = new TestObserver();
        WeatherData wd = new WeatherData();
        wd.registerObserver(o);

        // Act
        wd.removeObserver(o);

        // Assert
        ArrayList<WeatherObserver> olist = wd.observerList();
        assertTrue(olist.isEmpty());
    }

    @Test
    public void givenWeatherDataWithRegisteredObserver_WhenSetMeasurements_ThenObserversNotified() {
        // Arrange
        WeatherObserver o = new TestObserver();
        WeatherData wd = new WeatherData();
        wd.registerObserver(o);

        // Act
        wd.setMeasurements(25.0, 45.2, 30.0);

        // Assert
        TestObserver testObserver = (TestObserver)o; 
        assertEquals(25.0, testObserver.getTemperature(), 0.01);
        assertEquals(45.2, testObserver.getHumidity(), 0.01);
        assertEquals(30.0, testObserver.getPressure(), 0.01);
    }
}
