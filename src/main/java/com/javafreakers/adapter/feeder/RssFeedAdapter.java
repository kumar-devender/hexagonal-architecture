package com.javafreakers.adapter.feeder;

import com.javafreakers.Application;
import com.javafreakers.dto.BaseWeatherDTO;
import com.javafreakers.dto.RssFeed;
import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.feeder.WeatherFeeder;

public class RssFeedAdapter implements WeatherFeeder {

    private Application application;

    public RssFeedAdapter(Application application) {
        this.application = application;
    }

    public void feedWeather(BaseWeatherDTO feed) {
        RssFeed httpFeed = (RssFeed) feed;
        WeatherInfo weatherInfo = new WeatherInfo();
        weatherInfo.setHumidity(Double.toString(httpFeed.getHumidity()));
        weatherInfo.setPrecipitation(Double.toString(httpFeed.getPrecipitation()));
        weatherInfo.setPressure(Double.toString(httpFeed.getPressure()));
        weatherInfo.setTemperature(Double.toString(httpFeed.getTemperature()));
        weatherInfo.setWindSpeed(Double.toString(httpFeed.getWindSpeed()));
        weatherInfo.setSource(SourceType.RSS_FEED);
        application.saveWeather(weatherInfo);
    }
}
