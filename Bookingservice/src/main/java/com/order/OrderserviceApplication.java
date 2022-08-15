package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;

import com.order.repository.service.EmailSenderService;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.order")
public class OrderserviceApplication {
	
	@Autowired
	private EmailSenderService senderservice; 

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderservice.sendEmail("niraliverma.72@gmail.com",
				"Thankyou For placing an order",
				"Congratulations ! Your order gets placed");
	}
	
	}


