package com.nish.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.models.Product;
import com.nish.services.DistributorService;

@RestController
@RequestMapping("/Distributor")
public class DistributorRestController {
	
	@Autowired
	private DistributorService distributorService;
	
	@PostMapping("/registerProduct")
	public String registerProduct(@RequestBody Product product)
	{
		Product tmp=distributorService.registerProduct(product);
		if(tmp!=null)
			return "New Product Registered Successfully";
		else
			return "Error Registering Product";
	}

}
