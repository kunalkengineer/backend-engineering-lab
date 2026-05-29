package com.kunal.backendlab.springcore;

import com.kunal.backendlab.springcore.hw.Cakebaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreModuleApplication implements CommandLineRunner {
@Autowired
PaymentService paymentService;

@Autowired
    Cakebaker cakebaker;

//@Autowired
INotificationService notificationService;
    SpringCoreModuleApplication(@Qualifier("smsNotif") INotificationService notificationService){
        this.notificationService = notificationService;
    }


	public static void main(String[] args) {
		SpringApplication.run(SpringCoreModuleApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        paymentService.pay();
        notificationService.send("hello");
        cakebaker.bakeCake();
    }
}
