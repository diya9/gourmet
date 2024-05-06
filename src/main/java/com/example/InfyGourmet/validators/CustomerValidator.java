package com.example.InfyGourmet.validators;

import org.springframework.stereotype.Component;

import com.example.InfyGourmet.dto.Customer;

@Component
public class CustomerValidator {

//	private final CustomerService customerService;
//
//	public CustomerValidator(CustomerService customerService) {
//		this.customerService = customerService;
//	}
	
	public boolean validateEmail(String email) {
		return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
	}
	
	public boolean validateMobileNumber(long mobileNumber) {
		String mobileString = String.valueOf(mobileNumber);
		return mobileString.length() == 10;
	}
	
	public boolean isMobileNumberUnique(long mobileNumber) {
		return true;
	}
	
}
