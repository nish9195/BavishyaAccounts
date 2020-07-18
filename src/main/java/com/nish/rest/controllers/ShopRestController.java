package com.nish.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nish.services.ShopService;

@RestController
public class ShopRestController {
	
	@Autowired
	private ShopService shopService;

}
