package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Users {
	@Value("${userId}")
	int userId;
	@Value("${name}")
	String name;
	@Autowired
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
