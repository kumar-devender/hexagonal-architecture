package com.javafreakers.port.repository;

import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.WeatherInfo;

import java.util.List;

public interface WeatherRepository {
    WeatherInfo save(WeatherInfo weatherInfo);

    List<WeatherInfo> getWeatherInfo(SourceType source);
}
