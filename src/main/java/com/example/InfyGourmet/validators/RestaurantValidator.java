package com.example.InfyGourmet.validators;

import org.springframework.stereotype.Component;

@Component
public class RestaurantValidator {

	public boolean validateRestaurantType(String restaurantType) {
		return restaurantType.equalsIgnoreCase("NonVeg") ||
				restaurantType.equalsIgnoreCase("Veg") ||
				restaurantType.equalsIgnoreCase("Bakery") ||
				restaurantType.equalsIgnoreCase("Sweet") ||
				restaurantType.equalsIgnoreCase("Cafe");
	}
}
