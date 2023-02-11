package com.example.learningsandboxproject.abstraction;

public interface SMSNotificationService extends SandboxAbstraction {
    void sendSMS(String phoneNumber, String message);
}
