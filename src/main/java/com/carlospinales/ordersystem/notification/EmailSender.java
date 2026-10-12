package com.carlospinales.ordersystem.notification;

public interface EmailSender {
    void sendEmail(String phone, String message);
}
