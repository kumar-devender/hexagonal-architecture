package com.javafreakers;

import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.notification.Notification;
import com.javafreakers.port.repository.WeatherRepository;

import java.util.Collection;
import java.util.List;

public class Application {
    private WeatherRepository repository;
    private Collection<Notification> notificationClient;

    public Application(WeatherRepository repository, List<Notification> notificationClient) {
        this.repository = repository;
        this.notificationClient = notificationClient;
    }

    public void saveWeather(WeatherInfo weatherInfo) {
        WeatherInfo savedEntity = repository.save(weatherInfo);
        notificationClient.forEach(notification -> notification.sendNotification(savedEntity));
    }
}
