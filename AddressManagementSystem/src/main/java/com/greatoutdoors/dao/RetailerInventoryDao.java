package com.greatoutdoors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoors.entity.RetailerInventory;

public interface RetailerInventoryDao extends JpaRepository<RetailerInventory, Long> {

}
