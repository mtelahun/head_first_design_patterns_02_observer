package test;

import org.junit.Test;

public class WeatherObserverTest {
    @Test
    void givenWeatherDataWhenRegisterObserverThenObserverInObserverList() {
        // Arrange
        Observer o = new TestObserver();
        WeatherData wd = new WeatherData();

        // Act
        wd.registerObserver(0);

        // Assert
        ArrayList<Observer> olist = wd.observerList();
    }
    
}
