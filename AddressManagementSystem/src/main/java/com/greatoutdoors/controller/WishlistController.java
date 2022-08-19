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

import com.greatoutdoors.entity.Wishlist;
import com.greatoutdoors.service.WishlistService;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
	@Autowired
	private WishlistService service;

	@PostMapping("/addToWishlist")
	public ResponseEntity<Wishlist> addProductToWishlist(@RequestBody Wishlist w) {
		return new ResponseEntity<Wishlist>(service.addProductToWishlist(w), HttpStatus.CREATED);
	}

	@GetMapping("/viewall")
	public List<Wishlist> viewAllItemsOfWishlist() {
		return service.viewAllItemsOfWishlist();
	}

	@GetMapping("{id}")
	public ResponseEntity<Wishlist> findPriductInWishlist(@PathVariable("id") Long wid) {
		return new ResponseEntity<Wishlist>(service.findPriductInWishlist(wid), HttpStatus.OK);
		// status -- 200
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteWishlistByUserId(@PathVariable("id") Long wid) {
		service.deleteWishlistByUserId(wid);
		return new ResponseEntity<String>("Wishlist record deleted successfully!", HttpStatus.OK);
	}

	@DeleteMapping
	public void deleteAll() {
		service.deleteAllWishlist();
	}
}
