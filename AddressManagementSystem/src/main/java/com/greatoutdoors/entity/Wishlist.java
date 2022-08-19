package com.greatoutdoors.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wishlist_manage")
public class Wishlist {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long wishlistId;
	private long productId;
	private String product;//come from product
	public Wishlist() {
		super();
	}
	public Wishlist(long wishlistId, long productId, String product) {
		super();
		this.wishlistId = wishlistId;
		this.productId = productId;
		this.product = product;
	}
	public long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
}
//@OneToOne
//@JoinColumn(name="user_Id")
//private UserEntity userId;

//@ManyToOne
//@JoinColumn(name="product_Id")
//private ProductEntity product;