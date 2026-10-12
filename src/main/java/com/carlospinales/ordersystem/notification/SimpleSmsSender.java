package com.carlospinales.ordersystem.notification;

public class SimpleSmsSender implements SmsSender {
    @Override
    public void sendSms(String phone, String message ){
        System.out.println("Sending SMS to " + phone + ": " + message);
    }
}
