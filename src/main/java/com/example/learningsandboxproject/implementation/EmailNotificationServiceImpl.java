package com.example.learningsandboxproject.implementation;

import org.springframework.stereotype.Service;

@Service
class EmailNotificationServiceImpl implements com.example.learningsandboxproject.abstraction.EmailNotificationService {
    @Override
    public void sendNotification(String message) {
        this.sendEmail("test@email.com", message);
    }

    @Override
    public void sendEmail(String email, String message) {
        System.out.println("Sending SMS to " + email + ": " + message);
    }
}