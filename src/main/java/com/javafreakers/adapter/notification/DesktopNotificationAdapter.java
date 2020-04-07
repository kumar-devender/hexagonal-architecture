package com.javafreakers.adapter.notification;

import com.javafreakers.dto.WeatherInfo;
import com.javafreakers.port.notification.Notification;

public class DesktopNotificationAdapter implements Notification {
    @Override
    public void sendNotification(WeatherInfo weatherInfo) {
        System.out.println("Sending desktop notification");
    }
}
