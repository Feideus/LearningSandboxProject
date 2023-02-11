package com.example.learningsandboxproject.controller;

import com.example.learningsandboxproject.abstraction.EmailNotificationService;
import com.example.learningsandboxproject.abstraction.SMSNotificationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sandbox")
@AllArgsConstructor()
class SandboxController {
    private final EmailNotificationService emailNotificationService;
    private final SMSNotificationService smsNotificationService;

    @PostMapping("/send-email-notification")
    void sendEmailNotification(@RequestBody String message) {
        emailNotificationService.sendNotification(message);
    }

    @PostMapping("/send-sms-notification")
    void sendSMSNotification(@RequestBody String message) {
        smsNotificationService.sendNotification(message);
    }
}