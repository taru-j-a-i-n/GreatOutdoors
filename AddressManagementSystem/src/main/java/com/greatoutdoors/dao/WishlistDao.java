package com.greatoutdoors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoors.entity.Wishlist;

public interface WishlistDao extends JpaRepository<Wishlist, Long>{

}
