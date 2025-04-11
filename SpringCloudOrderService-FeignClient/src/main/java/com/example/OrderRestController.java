package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.ICartConsumer;
import com.practice.entity.Cart;



@RestController
@RequestMapping("/v1/api/order")
public class OrderRestController {

	@Autowired
	ICartConsumer cartConsumer;
	
	@GetMapping("/place")
	public ResponseEntity<String> placeOrder(){
		
		String cartResponse = cartConsumer.getProduct().getBody();
		return ResponseEntity.ok("Order Placed With => "+cartResponse);
		//return ResponseEntity.ok("Order Placed With => ");
	}
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<String> fetchOrderWithCart(@PathVariable() Integer id){
		Cart cob = cartConsumer.getCartById(1).getBody();
		System.out.println(cob.getCartId());
		return ResponseEntity.ok("ORDER with CART DATA => "+cob.toString());
	}
	
}
