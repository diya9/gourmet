package com.example.InfyGourmet.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.InfyGourmet.dto.Menu;
import com.example.InfyGourmet.dto.MenuItem;

@Service
public class MenuItemService {

	private List<MenuItem> items;
	
	public MenuItemService() {
		items = new ArrayList<MenuItem>();
	}
	
	public void addMenuItem(MenuItem menuItem) {
		items.add(menuItem);
	}
}
