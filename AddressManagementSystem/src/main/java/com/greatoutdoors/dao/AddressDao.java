package com.greatoutdoors.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatoutdoors.entity.Address;

public interface AddressDao extends JpaRepository<Address, Long>{

}
