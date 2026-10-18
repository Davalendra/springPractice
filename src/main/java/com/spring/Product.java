package com.spring;

public class Product {
	int proId;
	String name;
	int price;
	
	public Product()
	{
		
	}

	public Product(int proId, String name, int price) {
		super();
		this.proId = proId;
		this.name = name;
		this.price = price;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
