package com.cafe.payment;

public class Payment {

	private String howToPay;

	public Payment() {}

	public Payment(String payCard, String payPoint) {
		super();
		this.howToPay = payCard;

	}

	public String getHowToPay() {
		return howToPay;
	}

	public void setHowToPay(String howToPay) {
		this.howToPay = howToPay;
	}
	
	
}
