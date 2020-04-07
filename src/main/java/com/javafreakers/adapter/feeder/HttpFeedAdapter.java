package com.javafreakers.adapter.feeder;

import com.javafreakers.Application;
import com.javafreakers.dto.BaseWeatherDTO;
import com.javafreakers.dto.HttpFeed;
import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.feeder.WeatherFeeder;

public class HttpFeedAdapter implements WeatherFeeder {

    private Application application;

    public HttpFeedAdapter(Application application) {
        this.application = application;
    }

    public void feedWeather(BaseWeatherDTO feed) {
        HttpFeed httpFeed = (HttpFeed) feed;
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setHumidity(Float.toString(httpFeed.getHumidity()));
        weatherInfo.setPrecipitation(Float.toString(httpFeed.getPrecipitation()));
        weatherInfo.setPressure(Float.toString(httpFeed.getPressure()));
        weatherInfo.setTemperature(Float.toString(httpFeed.getTemperature()));
        weatherInfo.setWindSpeed(Float.toString(httpFeed.getWindSpeed()));
        weatherInfo.setSource(SourceType.HTTP_FEED);
        application.saveWeather(weatherInfo);
    }
}
