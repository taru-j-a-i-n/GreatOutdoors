package com.greatoutdoors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoors.entity.Cart;

public interface CartDao extends JpaRepository<Cart,Long>{

}
