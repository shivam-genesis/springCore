package com.springcore.lifecycle;

public class Item {
	private double price;

	public Item() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Initialization Method!!");
	}
	
	public void destroy() {
		System.out.println("Destroy Method!!");
	}

}
