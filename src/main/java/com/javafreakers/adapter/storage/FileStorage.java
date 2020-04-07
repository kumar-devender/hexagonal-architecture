package com.javafreakers.adapter.storage;

import com.javafreakers.dto.SourceType;
import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.repository.WeatherRepository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class FileStorage implements WeatherRepository {

    public WeatherInfo save(WeatherInfo weatherInfo) {
        // code to save in file
        throw new NotImplementedException();
    }

    public List<WeatherInfo> getWeatherInfo(SourceType source) {
        throw new NotImplementedException();
    }
}
