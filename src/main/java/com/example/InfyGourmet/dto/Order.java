package com.example.InfyGourmet.dto;

import java.util.List;

public class Order {

	private int orderId;
	private Customer customer;
	private List<MenuItem> items;
	private double orderAmt;
	private String orderStatus;
	
	public Order() {}

	public Order(int orderId, Customer customer, List<MenuItem> items, double orderAmt, String orderStatus) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.items = items;
		this.orderAmt = orderAmt;
		this.orderStatus = orderStatus;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void setItems(List<MenuItem> items) {
		this.items = items;
	}

	public double getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(double orderAmt) {
		this.orderAmt = orderAmt;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", orderAmt=" + orderAmt + ", orderStatus="
				+ orderStatus + "]";
	}
	
}
