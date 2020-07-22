package com.nish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.models.DSE;
import com.nish.repositories.DSERechargeRepository;
import com.nish.repositories.DSERepository;
import com.nish.repositories.ProductDSERepository;

@Service
public class DSEService {
	
	@Autowired
	private DSERepository dseRepository;
	
	@Autowired
	private ProductDSERepository productDSERepository;
	
	@Autowired
	private DSERechargeRepository dseRechargeRepository;
	
	public DSE registerDSE(DSE dse)
	{
		return dseRepository.save(dse);
	}
	
	public List<DSE> getDSEs()
	{
		return dseRepository.findAll();
	}

}
