package com.mju.demoproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mju.demoproduct.model.Product;
import com.mju.demoproduct.service.ProductService;

@RestController
public class HomeRestController {
	
    @Autowired
    ProductService productService;
    
	@GetMapping(path="/products", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	public List<Product> getProducts() {
    	System.err.println("ProductController getProducts");
        List<Product> products = productService.findAll();
        return products;
	}
	
}
