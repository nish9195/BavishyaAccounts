package com.nish.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.models.Distributor;
import com.nish.models.Product;
import com.nish.repositories.DistributorRechargeRepository;
import com.nish.repositories.DistributorRepository;
import com.nish.repositories.ProductDistributorRepository;
import com.nish.repositories.ProductRepository;

@Service
public class DistributorService {
	
	@Autowired
	private DistributorRepository distributorRepository;
	
	@Autowired
	private ProductDistributorRepository productDistributorRepository;
	
	@Autowired
	private DistributorRechargeRepository distributorRechargeRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public Distributor registerDistributor(Distributor distributor)
	{
		return distributorRepository.save(distributor);
	}
	
	public Product registerProduct(Product product)
	{
		return productRepository.save(product);
	}

}
