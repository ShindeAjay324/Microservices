package com.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/cart")
public class CartServiceController {
	
	@GetMapping("/show")
	public ResponseEntity<String> getProduct(){
		return ResponseEntity.ok("Welcome To Cart Service");
	}
}
