package com.example.InfyGourmet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.InfyGourmet.dao.MenuService;
import com.example.InfyGourmet.dto.Menu;

@RestController
public class MenuController {

	@Autowired
	public MenuService menuService;
	
	@GetMapping("/restaurants/{restaurantId}/menus")
	public List<Menu> getAllMenu(int restaurantId){
		return menuService.getAllMenu(restaurantId);
	}
	
	@PostMapping("/restaurants/{restaurantId}/menus")
	public String addMenu() {
		return "Menu Added!!";
	}
	
	@GetMapping("/menus/{menuId}")
	public Menu getMenuDetails(int menuId) {
		return menuService.getMenuDetails(menuId);
	}
	
}
