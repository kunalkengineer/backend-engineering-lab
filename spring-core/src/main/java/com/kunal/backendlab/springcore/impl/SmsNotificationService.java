package com.kunal.backendlab.springcore.impl;

import com.kunal.backendlab.springcore.INotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("smsNotif")
@ConditionalOnProperty(name="notification.type", havingValue = "sms")
public class SmsNotificationService implements INotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS is sending: "+message);
    }
}
