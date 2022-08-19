package com.greatoutdoors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoors.entity.Address;
import com.greatoutdoors.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService service;

	public AddressController(AddressService service) {
		super();
		this.service = service;
	}
	@PostMapping("/add")
	public ResponseEntity<Address> addAddress(@RequestBody Address addr) {
		return new ResponseEntity<Address>(service.addAddress(addr), HttpStatus.CREATED);
	}
	@PutMapping("/{addressId}")
	public ResponseEntity<Address> updateAirport(@RequestBody Address addr,@PathVariable("addressId")
	Long addressId ) {
		return new ResponseEntity<Address>(service.updateAddress(addr, addressId), HttpStatus.OK);
	}
	//deleting the data
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAddress(@PathVariable("id") Long addressId) {
		// delete airport db
		service.deleteAddress(addressId);
		return new ResponseEntity<String>("Address record deleted successfully!", HttpStatus.OK);
	}
}
