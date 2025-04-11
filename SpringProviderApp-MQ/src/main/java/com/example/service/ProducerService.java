package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	
	@Autowired
	private JmsTemplate jmt;
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	public void sendData(String message) {
		
		
		
		jmt.send(destination,session -> session.createTextMessage(message));
	}
	
}
