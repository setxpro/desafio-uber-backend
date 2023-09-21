package com.kipper.emailservice.application;

import com.kipper.emailservice.adapters.EmailSenderGateway;
import com.kipper.emailservice.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {
    // Vai implementar o core de fato da aplicação.

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendMessage(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
