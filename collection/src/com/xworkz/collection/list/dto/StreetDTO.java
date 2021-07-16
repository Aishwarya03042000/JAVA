package com.xworkz.collection.list.dto;

import java.io.Serializable;

public class StreetDTO implements Serializable {

	private String name;
	private int pincode;
	private String city;
	private String location;

	public StreetDTO() {
		System.out.println("Created StreeDTO ");
	}

	public StreetDTO(String name, int pincode, String city, String location) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.city = city;
		this.location = location;
	}

	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pincode=" + pincode + ", city=" + city + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
