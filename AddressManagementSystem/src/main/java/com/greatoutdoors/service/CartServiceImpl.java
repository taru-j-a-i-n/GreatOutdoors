package com.greatoutdoors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatoutdoors.dao.CartDao;
import com.greatoutdoors.entity.Cart;
import com.greatoutdoors.exception.ResourceNotFoundException;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao repo;

	@Override
	public Cart addItemToCart(Cart c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Cart findFromCartList(Long s) {
		// TODO Auto-generated method stub
		return repo.findById(s).orElseThrow(() -> new ResourceNotFoundException("Cart", "Id", s));
	}

	@Override
	public String deleteAnItemFromCart(Long c) {
		repo.findById(c).orElseThrow(() -> new ResourceNotFoundException("Cart", "Id", c));
		repo.deleteById(c);
		return "item is deleted";
	}

	@Override
	public List<Cart> findAllItemOfCart() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Cart updateCart(Cart d, Long c) {
		Cart e = repo.findById(c).orElseThrow(() -> new ResourceNotFoundException("Cart", "Id", c));
		// If the Id exists let's update the same with new value;
		e.setCartId(d.getCartId());
		e.setUserId(d.getUserId());
		e.setCartTotalPrice(d.getCartTotalPrice());
		e.setProducts(d.getProducts());
		e.setQuantity(d.getQuantity());
		e.setTotalQuantity(d.getTotalQuantity());

		repo.save(e);
		return e;

	}

	@Override
	public void deleteAllItemFromCart() {
		repo.deleteAll();
		
	}

}
