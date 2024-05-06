package com.example.InfyGourmet.dto;

public class Menu {

	private int menuId;
	private String menuName;
	private String description;
	private Restaurant restaurant;
	
	public Menu() {	}

	public Menu(int menuId, String menuName, String description, Restaurant restaurant) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.description = description;
		this.restaurant = restaurant;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", description=" + description + ", restaurant="
				+ restaurant + "]";
	}
	
}
