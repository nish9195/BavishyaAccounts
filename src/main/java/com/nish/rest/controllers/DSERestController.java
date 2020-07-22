package com.nish.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nish.models.DSE;
import com.nish.services.DSEService;

@RestController
@RequestMapping("/DSE")
public class DSERestController {
	
	@Autowired
	private DSEService dseService;
	
	@PostMapping("/registerDSE")
	public String registerDSE(@RequestBody DSE dse)
	{
		DSE tmp=dseService.registerDSE(dse);
		if(tmp!=null)
			return "New DSE Registered Successfully";
		else
			return "Error Registering DSE";
	}
	
	@GetMapping("/DSEs")
	public List<DSE> getDSEs()
	{
		return dseService.getDSEs();
	}

}
