package com.example.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.LoadBalancerClientApplication;

@Component
public class CartConsumer {
	

	
	@Autowired
	private LoadBalancerClient client;
	
	public String getCartService() {
		
		//Ask client to get the instance with low load factor using instance name
		ServiceInstance serviceInstance = client.choose("CART-SERVICE");
		
		//Using ServiceInstance fet the URI
		URI uri = serviceInstance.getUri();

		String url = uri +"/v1/api/cart/show";	
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		return responseEntity.getBody();
	}
}
