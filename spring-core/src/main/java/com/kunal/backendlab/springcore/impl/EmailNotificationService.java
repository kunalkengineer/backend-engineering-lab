package com.kunal.backendlab.springcore.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.kunal.backendlab.springcore.INotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailNotif")
@ConditionalOnProperty(name="notification.type", havingValue = "email")
public class EmailNotificationService implements INotificationService {

    @Override
    public void send(String message) {
        System.out.println("Emails is sending: "+message);
    }
}
