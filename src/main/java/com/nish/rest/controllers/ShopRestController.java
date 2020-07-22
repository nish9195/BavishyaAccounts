package com.nish.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.models.Shop;
import com.nish.services.ShopService;

@RestController
@RequestMapping("/Shop")
public class ShopRestController {
	
	@Autowired
	private ShopService shopService;
	
	@PostMapping("/registerShop")
	public String registerShop(@RequestBody Shop shop)
	{
		Shop tmp=shopService.registerShop(shop);
		if(tmp!=null)
			return "New Shop Registered Successfully";
		else
			return "Error Registering Shop";
	}
	
	@GetMapping("/Shops")
	public List<Shop> getShops()
	{
		return shopService.getShops();
	}

}
