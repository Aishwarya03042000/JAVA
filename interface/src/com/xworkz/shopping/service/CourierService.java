package com.xworkz.shopping.service;

import com.xworkz.shopping.item.ItemDelivery;

public class CourierService implements ItemDelivery {

	String name;
	int totalLocation;
	boolean internationalDelivery;

	public CourierService(String name, int totalLocation, boolean internationalDelivery) {
		System.out.println("Created Courier Service");
		this.name = name;
		this.totalLocation = totalLocation;
		this.internationalDelivery = internationalDelivery;
	}

	@Override
	public int pickItem() {
		System.out.println("pick the item");
		return 2;
	}

	@Override
	public int dropItem() {
		System.out.println("Drop the item");
		return 1;
	}
}
