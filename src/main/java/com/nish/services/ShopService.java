package com.nish.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.repositories.ProductShopRepository;
import com.nish.repositories.ShopRechargeRepository;
import com.nish.repositories.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	
	@Autowired
	private ProductShopRepository productShopRepository;
	
	@Autowired
	private ShopRechargeRepository shopRechargeRepository;

}
