package com.cafe.menu.domain;

public class MenuList {

	private int order_num;
	private String o_menu_name;
	private int order_price;
	private String payment;
	private String who_order;
	
	
	public MenuList() { 
		
	}

	public MenuList(int order_num, String o_menu_name, int order_price, String payment, String who_order) {
		super();
		this.order_num = order_num;
		this.o_menu_name = o_menu_name;
		this.order_price = order_price;
		this.payment = payment;
		this.who_order = who_order;
	}


	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public String getO_menu_name() {
		return o_menu_name;
	}

	public void setO_menu_name(String o_menu_name) {
		this.o_menu_name = o_menu_name;
	}

	public int getOrder_price() {
		return order_price;
	}

	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getWho_order() {
		return who_order;
	}

	public void setWho_order(String who_order) {
		this.who_order = who_order;
	}
	
	public String toString() {
		return "♥♥♥ 주문번호: "+order_num+" 메뉴명: "+o_menu_name+" | 가격: "+order_price+"원"+" | 결제방법: "+payment;
	}
}

	