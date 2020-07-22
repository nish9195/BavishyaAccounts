package com.nish.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.models.Product;
import com.nish.services.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductRestController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/registerProduct")
	public String registerProduct(@RequestBody Product product)
	{
		Product tmp=productService.registerProduct(product);
		if(tmp!=null)
			return "New Product Registered Successfully";
		else
			return "Error Registering Product";
	}
	
	@GetMapping("Products")
	public List<Product> getProducts()
	{
		return productService.getProducts();
	}

}
