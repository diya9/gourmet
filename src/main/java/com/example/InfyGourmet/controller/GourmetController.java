package com.example.InfyGourmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InfyGourmet.dao.impl.GaurmetServiceImpl;
import com.example.InfyGourmet.dto.Customer;

@RestController
public class GourmetController {
	
	@Autowired
	public GaurmetServiceImpl goGaurmetServiceImpl;

	@PostMapping("/customers")
	public String addCustomer(@RequestBody Customer customer) {
		return goGaurmetServiceImpl.createCustomer(customer);
	}
}
