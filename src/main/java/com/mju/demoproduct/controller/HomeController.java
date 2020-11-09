package com.mju.demoproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mju.demoproduct.model.Product;
import com.mju.demoproduct.service.ProductService;

@Controller
public class HomeController {
	
    @Autowired
    ProductService productService;
	
	@GetMapping(path="/mydemop")
	@ResponseStatus(HttpStatus.OK)
	public String myDemop(Model model) {
    	System.err.println("ProductController mydemop");
        List<Product> products = productService.findAll();
        
        model.addAttribute("products", products);
        
        return "/index"; // index.jsp
	}
	
}
