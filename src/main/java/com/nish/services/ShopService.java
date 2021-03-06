package com.nish.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nish.models.Shop;
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
	
	public Shop registerShop(Shop shop)
	{
		return shopRepository.save(shop);
	}
	
	public List<Shop> getShops()
	{
		return shopRepository.findAll();
	}
}
