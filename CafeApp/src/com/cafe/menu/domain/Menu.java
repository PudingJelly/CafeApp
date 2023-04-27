package com.cafe.menu.domain;

public class Menu {
	
	private String menuName;
	private int price;
	private String menuType;
	
	public Menu() {}

	public Menu(String menuName, int price, String menuType) {
		super();
		this.menuName = menuName;
		this.price = price;
		this.menuType = menuType;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	
	public String toString() {
		return "♥♥♥ 메뉴명: "+menuName+" | 가격: "+price+"원"+" | 타입: "+menuType;
	}
	
	

}
