package com.xworkz.shopping.app;

import com.xworkz.shopping.item.ItemDelivery;

public class Flipkart {

	private ItemDelivery delivery;

	public Flipkart() {
		System.out.println("Created Flipkart");
	}

	public void deliverProduct() {
		System.out.println("Product is delivered");
		int temp1 = this.delivery.dropItem();
		System.out.println(temp1);
	}

	public void returnProduct() {
		System.out.println("Return the product");
		int temp2 = this.delivery.pickItem();
		System.out.println(temp2);
	}

	public void setRule(ItemDelivery delivery) {
		this.delivery = delivery;
		this.deliverProduct();
		this.returnProduct();
	}
}
