package com.xworkz.collection.list.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StreetTester {

	public static void main(String[] args) {

		StreetDTO street = new StreetDTO("JSS clg rd", 560512, "Mysore", "JSS College");
		StreetDTO street1 = new StreetDTO("Halebeed road", 573125, "Hassan", "Saalugaame");
		StreetDTO street2 = new StreetDTO("SIT Backgate", 572102, "Tumkur", "Ashok Nagar");

		List<StreetDTO> list = new ArrayList<StreetDTO>();
		list.add(street);
		list.add(street1);
		list.add(street2);
		System.out.println("Size: " + list.size());

		System.out.println("Before set: " + list.get(2));

		list.set(2, street2);

		ListIterator<StreetDTO> iterator = list.listIterator();

		while (iterator.hasNext()) {
			StreetDTO ref = iterator.next();
			System.out.println(ref);
		}
		StreetDTO temp = new StreetDTO("BH rd", 572201, "Tiptur", "Sharadha Nagar");
		boolean contain = list.contains(temp);

		System.out.println("Contains: " + contain);
		System.out.println("Contain all element " + list.containsAll(list));
		System.out.println("Before remove size: " + list.size());
		System.out.println("Removed element: " + list.remove(street2));
		System.out.println("Before set: " + list.get(1));

	}

}
