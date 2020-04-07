package com.javafreakers.adapter.storage;

import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.repository.WeatherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class InMemoryStorage implements WeatherRepository {

    private List<WeatherInfo> weatherInfos;

    public InMemoryStorage() {
        this.weatherInfos = new ArrayList<>();
    }

    public WeatherInfo save(WeatherInfo weatherInfo) {
        weatherInfo.setId(UUID.randomUUID());
        weatherInfos.add(weatherInfo);
        return weatherInfo;
    }

    public List<WeatherInfo> getWeatherInfo(SourceType source) {
        return weatherInfos.stream()
                .filter(weatherInfo -> weatherInfo.getSource().equals(source))
                .collect(Collectors.toList());
    }
}
