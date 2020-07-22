package com.nish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.models.Distributor;
import com.nish.repositories.DistributorRechargeRepository;
import com.nish.repositories.DistributorRepository;
import com.nish.repositories.ProductDistributorRepository;

@Service
public class DistributorService {
	
	@Autowired
	private DistributorRepository distributorRepository;
	
	@Autowired
	private ProductDistributorRepository productDistributorRepository;
	
	@Autowired
	private DistributorRechargeRepository distributorRechargeRepository;
	
	public Distributor registerDistributor(Distributor distributor)
	{
		return distributorRepository.save(distributor);
	}
	
	public List<Distributor> getDistributors()
	{
		return distributorRepository.findAll();
	}

}
