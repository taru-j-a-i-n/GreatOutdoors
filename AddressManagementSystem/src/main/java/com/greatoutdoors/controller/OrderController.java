package com.greatoutdoors.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatoutdoors.entity.Order;
import com.greatoutdoors.exception.OrderException;
import com.greatoutdoors.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	//add orders
	@PostMapping("/placeOrder")
	public ResponseEntity<Order> placeOrder(@RequestBody Order o) {
		return new ResponseEntity<Order>(service.placeOrder(o), HttpStatus.CREATED);
	}

	// Find All Orders
	@GetMapping("/findAllOrders")
	public List<Order> findAllOrders() {
		return service.findAllOrders();
	}
	//find by id
	@GetMapping("/{id}")
	public ResponseEntity<Order> findOrderById(@PathVariable("id") Long oid) throws OrderException {
		return new ResponseEntity<Order>(service.findOrderById(oid), HttpStatus.OK);
		// status -- 200
	}

	// Delete All Orders
	@DeleteMapping("/deleteAllOrders")
	public String cancelAllOrders() throws OrderException {
		return service.cancelAllOrders();
	}
	//Delete Order By Using Order Id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAnItemFromCart(@PathVariable("id") Long oId) throws OrderException {
		service.cancelOrderById(oId);
		return new ResponseEntity<String>("Order deleted successfully!", HttpStatus.OK);
	}
	//updating the date 
	@PutMapping("update/{oid}/{did}/{dId}")
	public ResponseEntity<Order> updateOrder(@RequestBody Order o,@PathVariable("oid") Long oId,
	@PathVariable("did") String d,@PathVariable(name="dID") String k )
	throws OrderException{
		return new ResponseEntity<Order>(service.updateDate(o, oId), HttpStatus.OK);
	}

}
