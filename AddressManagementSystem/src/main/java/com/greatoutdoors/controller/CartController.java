package com.greatoutdoors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greatoutdoors.entity.Cart;
import com.greatoutdoors.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private CartService service;
	@PostMapping("/addToCart")
	public ResponseEntity<Cart> addItemToCart(@RequestBody Cart c) {
		return new ResponseEntity<Cart>(service.addItemToCart(c), HttpStatus.CREATED);
	}

	@GetMapping("/viewall")
	public List<Cart> findAllItemOfCart() {
		return service.findAllItemOfCart();
	}

	@GetMapping("{id}")
	public ResponseEntity<Cart> findFromCartList(@PathVariable("id") Long cid) {
		return new ResponseEntity<Cart>(service.findFromCartList(cid), HttpStatus.OK);
		// status -- 200
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAnItemFromCart(@PathVariable("id") Long cid) {
		service.deleteAnItemFromCart(cid);
		return new ResponseEntity<String>("Cart record deleted successfully!", HttpStatus.OK);
	}

	@DeleteMapping
	public void deleteAllItemFromCart() {
		service.deleteAllItemFromCart();
	}
}
