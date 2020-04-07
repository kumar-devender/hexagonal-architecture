package com.javafreakers.adapter.feeder;

import com.javafreakers.Application;
import com.javafreakers.dto.BaseWeatherDTO;
import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.TelemetryFeed;
import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.feeder.WeatherFeeder;

public class TelemetryFeedAdapter implements WeatherFeeder {
    private Application application;

    public TelemetryFeedAdapter(Application application) {
        this.application = application;
    }

    public void feedWeather(BaseWeatherDTO feed) {
        TelemetryFeed httpFeed = (TelemetryFeed) feed;
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setHumidity(Integer.toString(httpFeed.getHumidity()));
        weatherInfo.setPrecipitation(Integer.toString(httpFeed.getPrecipitation()));
        weatherInfo.setPressure(Integer.toString(httpFeed.getPressure()));
        weatherInfo.setTemperature(Integer.toString(httpFeed.getTemperature()));
        weatherInfo.setWindSpeed(Integer.toString(httpFeed.getWindSpeed()));
        weatherInfo.setSource(SourceType.TELEMETRY_FEED);
        application.saveWeather(weatherInfo);
    }
}
