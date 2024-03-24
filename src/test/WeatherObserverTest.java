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
        WeatherData wd = new WeatherData();

        // Act
        WeatherObserver o = new TestObserver(wd);

        // Assert
        ArrayList<WeatherObserver> olist = wd.getObservers();
        assertEquals(1, olist.size());
        assertEquals(o, olist.get(0));
    }
    
    @Test
    public void givenWeatherDataWithRegisteredObserverWhenObserverRemovedThenObserverNotInObserverList() {
        // Arrange
        WeatherData wd = new WeatherData();
        WeatherObserver o = new TestObserver(wd);

        // Act
        wd.removeObserver(o);

        // Assert
        ArrayList<WeatherObserver> olist = wd.getObservers();
        assertTrue(olist.isEmpty());
    }

    @Test
    public void givenWeatherDataWithRegisteredObserver_WhenSetMeasurements_ThenObserversNotified() {
        // Arrange
        WeatherData wd = new WeatherData();
        WeatherObserver o = new TestObserver(wd);

        // Act
        wd.setMeasurements(25.0f, 45.2f, 30.0f);

        // Assert
        TestObserver testObserver = (TestObserver)o; 
        assertEquals(25.0, testObserver.getTemperature(), 0.01);
        assertEquals(45.2, testObserver.getHumidity(), 0.01);
        assertEquals(30.0, testObserver.getPressure(), 0.01);
    }
}
