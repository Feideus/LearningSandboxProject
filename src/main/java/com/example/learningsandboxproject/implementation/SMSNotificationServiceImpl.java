package com.example.learningsandboxproject.implementation;

import org.springframework.stereotype.Service;

@Service
class SMSNotificationServiceImpl implements com.example.learningsandboxproject.abstraction.SMSNotificationService  {
    @Override
    public void sendNotification(String message) {
        this.sendSMS("070707070707",message);
    }

    @Override
    public void sendSMS(String phoneNumber,String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);        }
}