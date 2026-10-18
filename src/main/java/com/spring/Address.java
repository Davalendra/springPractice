package com.spring;

public class Address {
	String street;
	int pincode;
	String contry;
	
	public Address()
	{
		
	}

	public Address(String street, int pincode, String contry) {
		super();
		street = street;
		this.pincode = pincode;
		contry = contry;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	@Override
	public String toString() {
		return "Address [Street=" + street + ", pincode=" + pincode + ", Contry=" + contry + "]";
	}

	
	
	

}
