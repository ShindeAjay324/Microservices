package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Cart;

@RestController
@RequestMapping("/v1/api/cart")
public class CartServiceController {
	
	@Value("${server.port}")
	private String portNo;
	
	@GetMapping("/show")
	public ResponseEntity<String> getProduct(){
		return ResponseEntity.ok("Welcome To Cart Service Running on :: "+portNo);
	}
	
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable("id") Integer id){
		Cart cart = new Cart();
		cart.setCartId(id);
		cart.setCartCost(2300.00);
		cart.setCartCode("TEST");
		return ResponseEntity.ok(cart);
		
	}
	
}
