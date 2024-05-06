package com.example.InfyGourmet.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.InfyGourmet.dto.Restaurant;

@Service
public class RestaurantService {

	private List<Restaurant> restaurants;
	
	public RestaurantService() {
		restaurants = new ArrayList<>();
	}
	
	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}
	
	public List<Restaurant> getAllRestaurannt() {
		return this.restaurants;
	}
	
	public Restaurant fetchRestaurantDetails(int restaurantId) {
		for(Restaurant restaurant : restaurants) {
			if(restaurant.getRestaurantId() == restaurantId) {
				return restaurant;
			}
		}
		return null;
	}
	
	public Restaurant updateRestaurantDetails(int restaurantId, Restaurant restaurant) {
		Restaurant restaurantDetail = null;
		for(int i=0;i<restaurants.size();i++) {
			restaurantDetail = restaurants.get(i);
			if(restaurantDetail.getRestaurantId() == restaurantId) {
				restaurants.set(i, restaurantDetail);
				break;
			}
		}
		return restaurantDetail;
	}
	
	public void removeRestaurant(int restaurantId) {
		Iterator<Restaurant> iterator = restaurants.iterator();
		while(iterator.hasNext()) {
			Restaurant restaurant = iterator.next();
			if(restaurant.getRestaurantId() == restaurantId) {
				iterator.remove();
				break;
			}
		}
	}
}
