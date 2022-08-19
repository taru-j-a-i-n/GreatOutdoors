package com.greatoutdoors.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventory_manage")
public class RetailerInventory {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long inventoryId;
	private long retailerId;
	private String retailerName;
	private long orderId;
	private long productId;
	private String productDetails;
	private int productQuantity;
	private double totalAmount;
	private String orderDispatchStatus;
	private String productDispatchStatus;
	private long productReceiveTimeStamp; 
	private long productDispatchTimeStamp; 
    private long productSaleTimeStamp;
    
	public RetailerInventory() {
		super();
	}

	public RetailerInventory(long retailerId, String retailerName, long orderId, long productId, String productDetails,
			int productQuantity, double totalAmount, String orderDispatchStatus, String productDispatchStatus,
			long productReceiveTimeStamp, long productDispatchTimeStamp, long productSaleTimeStamp) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.orderId = orderId;
		this.productId = productId;
		this.productDetails = productDetails;
		this.productQuantity = productQuantity;
		this.totalAmount = totalAmount;
		this.orderDispatchStatus = orderDispatchStatus;
		this.productDispatchStatus = productDispatchStatus;
		this.productReceiveTimeStamp = productReceiveTimeStamp;
		this.productDispatchTimeStamp = productDispatchTimeStamp;
		this.productSaleTimeStamp = productSaleTimeStamp;
	}

	public long getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(long retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderDispatchStatus() {
		return orderDispatchStatus;
	}

	public void setOrderDispatchStatus(String orderDispatchStatus) {
		this.orderDispatchStatus = orderDispatchStatus;
	}

	public String getProductDispatchStatus() {
		return productDispatchStatus;
	}

	public void setProductDispatchStatus(String productDispatchStatus) {
		this.productDispatchStatus = productDispatchStatus;
	}

	public long getProductReceiveTimeStamp() {
		return productReceiveTimeStamp;
	}

	public void setProductReceiveTimeStamp(long productReceiveTimeStamp) {
		this.productReceiveTimeStamp = productReceiveTimeStamp;
	}

	public long getProductDispatchTimeStamp() {
		return productDispatchTimeStamp;
	}

	public void setProductDispatchTimeStamp(long productDispatchTimeStamp) {
		this.productDispatchTimeStamp = productDispatchTimeStamp;
	}

	public long getProductSaleTimeStamp() {
		return productSaleTimeStamp;
	}

	public void setProductSaleTimeStamp(long productSaleTimeStamp) {
		this.productSaleTimeStamp = productSaleTimeStamp;
	}

	public long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}

	
}
