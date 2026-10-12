package com.carlospinales.ordersystem.notification;

public interface SmsSender {
    void sendSms(String phone, String message);
}
