package com.greatoutdoors.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cart_manage")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long cartId;
//	@OneToOne
//	@JoinColumn(name="user_Id")
	private long userId;//from user
	private double cartTotalPrice;
	private int quantity;
	private long totalQuantity;
//	@ManyToOne
//    @JoinColumn(name="product_id")
	private String products;//from product
	
	public Cart() {
	super();
}
	public Cart(Long cartId, long userId, double cartTotalPrice, int quantity, long totalQuantity, String products) {
	super();
	this.cartId = cartId;
	this.userId = userId;
	this.cartTotalPrice = cartTotalPrice;
	this.quantity = quantity;
	this.totalQuantity = totalQuantity;
	this.products = products;
}
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public double getCartTotalPrice() {
		return cartTotalPrice;
	}
	public void setCartTotalPrice(double cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	

}
