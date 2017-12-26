package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Hi on 25-12-2017.
 */
public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String defaulToAddress;

    /**
     * Creates a Simple Mail Message from the feedback pojo.
     * @param feedback The Feedback pojo
     * @return
     * */
    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPojo feedback) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaulToAddress);;
        message.setFrom(feedback.getEmail());
        message.setSubject("[DevOps Buddy]: Feedback Received From "+ feedback.getFirstName()+ " "+ feedback.getLastName()+"!");
        message.setText(feedback.getFeedback());
        return message;
    }

    @Override
    public  void  sendFeedbackEmail(FeedbackPojo feedbackPojo) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPojo));
    }
}
