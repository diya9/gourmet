package com.example.InfyGourmet.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InfyGourmet.dao.GaurmetService;
import com.example.InfyGourmet.dto.Customer;
import com.example.InfyGourmet.dto.Menu;
import com.example.InfyGourmet.dto.MenuItem;
import com.example.InfyGourmet.dto.Order;
import com.example.InfyGourmet.dto.Restaurant;
import com.example.InfyGourmet.repository.GourmetRepository;

@Service
public class GaurmetServiceImpl implements GaurmetService{
	
	@Autowired
	public GourmetRepository gourmetRepository;

	@Override
	public String createCustomer(Customer customer) {
		return gourmetRepository.createCustomer(customer);
	}

	@Override
	public String addRestaurant(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return "Restaurant Added!!";
	}

	@Override
	public String addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return "Menu Added!!";
	}

	@Override
	public String addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		return "New Menu Item Added!!";
	}

	@Override
	public Order orderFood(String customerId, List<MenuItem> menuList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItem> getAllMenuItems(int restaurantId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItem> getMenuItems(int menuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getOrderDetails(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrderStatus(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
