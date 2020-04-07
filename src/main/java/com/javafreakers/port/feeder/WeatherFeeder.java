package com.javafreakers.port.feeder;

import com.javafreakers.dto.BaseWeatherDTO;

public interface WeatherFeeder {
    void feedWeather(BaseWeatherDTO feed);
}
