package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.entity.Cart;

@FeignClient("CART-SERVICE")
public interface ICartConsumer {
	
	
	@GetMapping("/v1/api/cart/show")
	public ResponseEntity<String> getProduct();
	
	@GetMapping("/v1/api/cart/find/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id);
}
