package com.greatoutdoors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatoutdoors.dao.RetailerInventoryDao;
import com.greatoutdoors.entity.RetailerInventory;
import com.greatoutdoors.exception.RetailerInventoryException;

public class RetailerInventoryServiceImpl implements RetailerInventoryService{
	@Autowired
	private RetailerInventoryDao repo;
	
	@Override
	public RetailerInventory addProduct(RetailerInventory product) {
		return repo.save(product);
	}

	@Override
	public RetailerInventory updateProductStock(RetailerInventory productStock) throws RetailerInventoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetailerInventory findProductByInventoryId(long inventoryId) throws RetailerInventoryException {
		// TODO Auto-generated method stub
		return repo.findById(inventoryId).orElseThrow(() -> new RetailerInventoryException("No such inventory id exist"));
	}

	@Override
	public void deleteInventoryById(long inventoryId) {
		// TODO Auto-generated method stub
		repo.deleteById(inventoryId);
		
	}

	@Override
	public List<RetailerInventory> getAllByRetailerId(long retailerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetailerInventory updateOrderDispatchStatus(long oId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RetailerInventory updateProductDispatchStatus(long pId) {
		// TODO Auto-generated method stub
		return null;
	}

}
