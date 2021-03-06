package kr.ac.knu.pattern.ovserver.weather;

import org.junit.Test;

/**
 * Created by rokim on 2017. 5. 28..
 */
public class WeatherDataCenterTest {
    @Test
    public void 브로드캐스트() {
        WeatherData weatherData = new WeatherData(30.0f, 25.3f, 1.2f);

        WeatherDataCenter weatherDataCenter = new WeatherDataCenter();
        weatherDataCenter.addObserver(new Radio());

        // send weather data to data-center
        weatherDataCenter.notifyWeatherData(weatherData);
    }
}