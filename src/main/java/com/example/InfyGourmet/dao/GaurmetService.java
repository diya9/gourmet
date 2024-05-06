package com.example.InfyGourmet.dao;

import java.util.List;

import com.example.InfyGourmet.dto.Customer;
import com.example.InfyGourmet.dto.Menu;
import com.example.InfyGourmet.dto.MenuItem;
import com.example.InfyGourmet.dto.Order;
import com.example.InfyGourmet.dto.Restaurant;

public interface GaurmetService {

	public String createCustomer(Customer customer);
	public String addRestaurant(Restaurant restaurant);
	public String addMenu(Menu menu);
	public String addMenuItem(MenuItem menuItem);
	public Order orderFood(String customerId, List<MenuItem> menuList);
	public List<MenuItem>getAllMenuItems(int restaurantId);
	public List<MenuItem> getMenuItems(int menuId);
	public List<Order> getOrderDetails(String customerId);
	public String getOrderStatus(int orderId);
}
