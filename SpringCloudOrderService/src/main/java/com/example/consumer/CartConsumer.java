package com.example.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartConsumer {
	
	@Autowired
	private DiscoveryClient client;
	
	public String getCartService() {
		
		List<ServiceInstance> instances = client.getInstances("Cart-Service");
		ServiceInstance serviceInstance = instances.get(0);
		URI uri = serviceInstance.getUri(); 
		String url = uri +"/v1/api/cart/show";	
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(uri, String.class);
		return responseEntity.getBody();
	}
}
