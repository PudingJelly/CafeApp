package com.cafe.order.domain;

public class Order {
	
	private int orderNum;

	public Order() {}
	
	public Order(int orderNum) {
		super();
		this.orderNum = orderNum;
	}

	//주문번호로 결제방법 써넣기 위해 추가.
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
}
