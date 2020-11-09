package com.mju.demoproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mju.demoproduct.model.Product;
import com.mju.demoproduct.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> findAll() {
		List<Product> list = productRepository.findAll();
		
		for (Product product : list) {
			System.out.println(product.toString());
		}

		return list;
	}
}
