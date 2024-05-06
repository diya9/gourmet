package com.example.InfyGourmet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.InfyGourmet.dao.RestaurantService;
import com.example.InfyGourmet.dto.Restaurant;

@RestController
public class RestaurantController {
	
	@Autowired
	public RestaurantService restaurantService;
	
	@GetMapping("/restaurants")
	public List<Restaurant> getAllRestaurant(){
		return restaurantService.getAllRestaurannt();
	}
	
	@PostMapping("/restaurant")
	public String addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
		return "Restaurant Added!!";
	}
	
	@GetMapping("/restaurants/{restaurantId}")
	public Restaurant fetchRestaurantDetails(@PathVariable int restaurantId) {
		return restaurantService.fetchRestaurantDetails(restaurantId);
	}

	@PutMapping("/restaurants/{restaurantId}")
	public Restaurant updateRestaurantDetails(int restaurantId, Restaurant restaurant) {
		return restaurantService.updateRestaurantDetails(restaurantId, restaurant);
	}
	
	@DeleteMapping("/restaurants/{restaurantId}")
	public String deleteRestaurant(int restaurantId) {
		restaurantService.removeRestaurant(restaurantId);
		return "Restaurant removed!!";
	}
}
