package com.example.InfyGourmet.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.InfyGourmet.dao.CustomerService;
import com.example.InfyGourmet.dao.MenuItemService;
import com.example.InfyGourmet.dao.MenuService;
import com.example.InfyGourmet.dao.RestaurantService;
import com.example.InfyGourmet.dto.Customer;
import com.example.InfyGourmet.dto.Menu;
import com.example.InfyGourmet.dto.MenuItem;
import com.example.InfyGourmet.dto.Order;
import com.example.InfyGourmet.dto.Restaurant;

@Repository
public class GourmetRepository {

	@Autowired
	public CustomerService customerService;
	
	@Autowired 
	public MenuService menuService;
	
	@Autowired 
	public RestaurantService restaurantService;
	
	@Autowired
	public MenuItemService menuItemService;
	
	
	public String createCustomer(Customer customer) {
		return customerService.addCustomers(customer);
	}
	
	public String addRestaurant(Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
		return "restaurant added!!";
	}
	
	public String addMenu(Menu menu){
		menuService.addMenu(menu);
		return "menu added!!";
	}
	
	public String addMenuItem(MenuItem menuItem) {
		menuItemService.addMenuItem(menuItem);
		return "menu item added";
	}
	
	public Order orderFood(String customerId, List<MenuItem> menuList) {
		return null;
	}
	
	public List<MenuItem>getAllMenuItems(int restaurantId){
		return null;
	}
	
	public List<MenuItem> getMenuItems(int menuId){
		return null;
	}
	
	public List<Order> getOrderDetails(String customerId){
		return null;
	}
	
	public String getOrderStatus(int orderId) {
		return null;
	}

}
