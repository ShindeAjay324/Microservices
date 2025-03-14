package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.CartConsumer;

@RestController
@RequestMapping("/v1/api/order")
public class OrderRestController {

	//@Autowired
	//CartConsumer cartConsumer;
	
	@GetMapping("/")
	public ResponseEntity<String> placeOrder(){
		
		//String cartResponse = cartConsumer.getCartService();
		//return ResponseEntity.ok("Order Placed With => "+cartResponse);
		return ResponseEntity.ok("Order Placed With => ");
	}
	
}
