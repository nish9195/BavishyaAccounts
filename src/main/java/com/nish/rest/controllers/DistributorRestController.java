package com.nish.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.models.Distributor;
import com.nish.services.DistributorService;

@RestController
@RequestMapping("/Distributor")
public class DistributorRestController {
	
	@Autowired
	private DistributorService distributorService;
	
	@PostMapping("/registerDistributor")
	public String registerDistributor(@RequestBody Distributor distributor)
	{
		Distributor tmp=distributorService.registerDistributor(distributor);
		if(tmp!=null)
			return "Distributor Registered Successfully";
		else
			return "Error Registering Distributor";
	}
	
	@GetMapping("/Distributors")
	public List<Distributor> getDistributors()
	{
		return distributorService.getDistributors();
	}

}
