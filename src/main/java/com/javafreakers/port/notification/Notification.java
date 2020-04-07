package com.javafreakers.port.notification;

import com.javafreakers.dto.WeatherInfo;

public interface Notification {
    void sendNotification(WeatherInfo weatherInfo);
}
