package com.kipper.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.kipper.emailservice.adapters.EmailSenderGateway;
import com.kipper.emailservice.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SesEmailSender implements EmailSenderGateway {

    // Use Sdk AWS
    private final AmazonSimpleEmailService amazonSimpleEmailService;

    // Indica que vai injetar automaticamente pelo spring.. @Autowired
    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest(

        ).withSource("patrickpqdt87289@gmail.com")
                .withDestination(new Destination().withToAddresses(to)).withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            this.amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception) {
            throw new EmailServiceException("Fail while sending email", exception);
        }
    }
}

