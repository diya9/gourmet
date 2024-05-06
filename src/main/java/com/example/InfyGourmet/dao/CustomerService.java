package com.example.InfyGourmet.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InfyGourmet.dto.Customer;
import com.example.InfyGourmet.validators.CustomerValidator;

@Service
public class CustomerService {
	
	private List<Customer> customers;
	
	@Autowired
	public CustomerValidator customerValidator;
	
	public CustomerService() {
		customers = new ArrayList<>();
		customers.add(new Customer("1","Pallavi",1234567890l,"pallavi@gmail.com"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public String addCustomers(Customer customer) {
		if(customerValidator.validateEmail(customer.getEmail())) {
			this.customers.add(customer);
			return "Added!";
		}else
			return "Please enter valid email";
		
	}
	
	public List<Customer> getAllCustomers(){
		return this.customers;
	}
}
