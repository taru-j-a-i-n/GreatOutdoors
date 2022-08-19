package com.greatoutdoors.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoors.dao.OrderDao;
import com.greatoutdoors.entity.Order;
import com.greatoutdoors.exception.OrderException;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao repo;

	@Override
	public Order placeOrder(Order o) {
		return repo.save(o);
	}

	@Override
	public List<Order> findAllOrders() {
		return repo.findAll();
	}

	@Override
	public Order findOrderById(long oId) throws OrderException{
		return repo.findById(oId).orElseThrow(() -> new OrderException("There is no such order id exist"));
	}

	@Override
	public String cancelAllOrders() {
		repo.deleteAll();
		return "all orders deleted successfuly";
	}

	@Override
	public String cancelOrderById(long oId) throws OrderException {
		if (repo.existsById(oId)) {
			repo.deleteById(oId);
			return "delete succesful";
		} else {
			throw new OrderException("Order Id is Not found");
		}
	}

	@Override
	public Order updateDate(Order o, long oId) throws OrderException {
		Order exist = repo.findById(oId).orElseThrow(()-> new OrderException("No order id exist"));
		exist.setDispatchDate(o.getDispatchDate());
		exist.setDeliveryDate(o.getDeliveryDate());
		exist.setOrderQuantity(o.getOrderQuantity());
		exist.setOrderId(o.getOrderId());
	    return repo.save(exist);
	    
	}

}

