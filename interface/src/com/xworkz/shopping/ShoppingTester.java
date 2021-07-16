package com.xworkz.shopping;

import com.xworkz.shopping.app.Flipkart;
import com.xworkz.shopping.item.ItemDelivery;
import com.xworkz.shopping.service.CourierService;
import com.xworkz.shopping.service.PostOfficeService;

public class ShoppingTester {

	public static void main(String[] args) {

		ItemDelivery delivery = new CourierService("Professional", 20, true);

		Flipkart flipkart = new Flipkart();
		flipkart.setRule(delivery);

		ItemDelivery delivery1 = new PostOfficeService(573125);
		flipkart.setRule(delivery1);
	}

}
