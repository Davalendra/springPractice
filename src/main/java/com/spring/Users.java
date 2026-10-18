package com.spring;

public class Users {

	int userId;
	String name;
	Address address;
	
	public Users()
	{
		
	}

	public Users(int userId, String name, Address address) {
		super();
		this.userId = userId;
		this.name = name;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", address=" + address + "]";
	}
	
}
