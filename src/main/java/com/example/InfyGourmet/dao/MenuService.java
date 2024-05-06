package com.example.InfyGourmet.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.InfyGourmet.dto.Menu;

@Service
public class MenuService {
	
	private List<Menu> menus;
	
	public MenuService() {
		menus = new ArrayList<>();
	}
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public List<Menu> getAllMenu(int restaurantId){
		List<Menu> list = new ArrayList();
		for(Menu menu: menus) {
			if(menu.getRestaurant().getRestaurantId() == restaurantId) {
				list.add(menu);
			}
		}
		return list;
	}

//	public String addMenuDetails(int restaurantId, Menu menu) {
//		
//		menus.add(menu);
//	}
	
	public Menu getMenuDetails(int menuId) {
		Menu menuData = null;
		for(Menu menu: menus) { 
			if(menu.getMenuId() == menuId) {
				menuData = menu;
			}
		}
		return menuData;
	}
}
