package com.greatoutdoors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoors.entity.Order;

public interface OrderDao extends JpaRepository<Order,Long> {

}
