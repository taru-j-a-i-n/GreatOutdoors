package com.greatoutdoors.service;

import java.util.List;

import com.greatoutdoors.entity.Cart;

public interface CartService {
	public Cart addItemToCart(Cart c);

	public Cart findFromCartList(Long s);

	public List<Cart> findAllItemOfCart();

	public String deleteAnItemFromCart(Long c);

	public void deleteAllItemFromCart();

	public Cart updateCart(Cart d, Long c);

}
