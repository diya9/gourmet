package com.example.InfyGourmet.dto;

public class MenuItem {
	
	private int itemId;
	private String itemName;
	private String description;
	private double price;
	private Menu menu;
	
	public MenuItem() {}

	public MenuItem(int itemId, String itemName, String description, double price, Menu menu) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.menu = menu;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "MenuItem [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", price="
				+ price + ", menu=" + menu + "]";
	}
	
}
