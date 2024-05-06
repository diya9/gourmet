package com.example.InfyGourmet.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.InfyGourmet.dto.Order;

@Service
public class OrderService {
	
	public List<Order> orders;
	
	public OrderService() {
		orders = new ArrayList<Order>();
		
	}
	
	public List<Order> getOrderDetails(String customerId){
		List<Order> orderList = new ArrayList();
		for(Order order: orders) {
			if(order.getCustomer().getCustomerId().equals(customerId)) {
				orderList.add(order);
			}
		}
		return orderList;
	}

	public String getOrderStatus(int orderId) {
		String status="";
		for(Order order: orders) {
			if(order.getOrderId() == orderId) {
				status = order.getOrderStatus();
			}
		}
		return status;
	}
}
