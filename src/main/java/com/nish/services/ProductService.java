package com.nish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.models.Product;
import com.nish.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product registerProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public List<Product> getProducts()
	{
		return productRepository.findAll();
	}
	
}
