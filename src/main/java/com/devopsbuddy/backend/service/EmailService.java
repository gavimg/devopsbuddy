package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Hi on 25-12-2017.
 */
public interface EmailService {

    /**
     * Sends email with the content in the feedbackPojo.
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends an email with the  content of the simple mail Messaga object.
     * @param message The object containing the email content.
     * */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
