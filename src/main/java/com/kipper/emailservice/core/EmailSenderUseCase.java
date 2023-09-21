package com.kipper.emailservice.core;

public interface EmailSenderUseCase {
    void sendMessage(String to, String subject, String body);
    void sendEmail(String to, String subject, String body);
}
