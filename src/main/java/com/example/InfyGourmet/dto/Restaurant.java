package com.example.InfyGourmet.dto;

public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String restaurentAddress;
	private String restaurantType;
	
	public Restaurant() {}

	public Restaurant(int restaurantId, String restaurantName, String restaurentAddress, String restaurantType) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurentAddress = restaurentAddress;
		this.restaurantType = restaurantType;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurentAddress() {
		return restaurentAddress;
	}

	public void setRestaurentAddress(String restaurentAddress) {
		this.restaurentAddress = restaurentAddress;
	}

	public String getRestaurantType() {
		return restaurantType;
	}

	public void setRestaurantType(String restaurantType) {
		this.restaurantType = restaurantType;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurentAddress=" + restaurentAddress + ", restaurantType=" + restaurantType + "]";
	}
	
}
