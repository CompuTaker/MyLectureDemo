package com.mju.demoproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mju.demoproduct.model.Product;


public interface ProductRepository extends JpaRepository<Product,Long> {
	
}
