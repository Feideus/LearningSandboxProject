package com.example.learningsandboxproject.abstraction;

public interface EmailNotificationService extends SandboxAbstraction {
    void sendEmail(String email, String message);
}
