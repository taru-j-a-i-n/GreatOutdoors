package com.greatoutdoors.service;

import java.util.List;

import com.greatoutdoors.entity.RetailerInventory;
import com.greatoutdoors.exception.RetailerInventoryException;

public interface RetailerInventoryService {

	public RetailerInventory addProduct(RetailerInventory product) ;
    public RetailerInventory updateProductStock(RetailerInventory productStock) throws RetailerInventoryException;
	public RetailerInventory findProductByInventoryId(long inventoryId)throws RetailerInventoryException ;
	public void deleteInventoryById(long inventoryId);
	public List<RetailerInventory> getAllByRetailerId(long retailerId);
	public RetailerInventory updateOrderDispatchStatus(long oId);
	public RetailerInventory updateProductDispatchStatus(long pId);
	
}
