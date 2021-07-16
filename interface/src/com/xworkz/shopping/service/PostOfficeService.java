package com.xworkz.shopping.service;

import com.xworkz.shopping.item.ItemDelivery;

public class PostOfficeService implements ItemDelivery {

	int pincode;

	public PostOfficeService(int pincode) {
		System.out.println("Created PostOfficeService");
		this.pincode = pincode;
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
