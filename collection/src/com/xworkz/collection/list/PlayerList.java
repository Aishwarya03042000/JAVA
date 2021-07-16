package com.xworkz.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class PlayerList {

	public static void main(String[] args) {

		List<String> players = new ArrayList<String>();
		players.add("Kohli");
		players.add("Padikkal");
		players.add("K L Rahul");
		players.add("ABD");
		players.add("Shreyas");
		players.add("Chahal");
		players.add("Rohith");

		Collections.sort(players);
		for (int i = 0; i < players.size(); i++) {
			System.out.println("Sorted list: " + players.get(i));
		}
		System.out.println("Before adding " + players.get(2));

		players.add(5, "Dekock");
		System.out.println("After adding " + players.get(5));
		System.out.println("Players size: " + players.size());

		ListIterator<String> iterator = players.listIterator(6);
		System.out.println("Iterator index: " + iterator.nextIndex());

		while (iterator.hasPrevious()) {
			String temp = iterator.previous();
			System.out.println("Backward list " + temp);
		}
		System.out.println("hasNext() and next() method");
		while (iterator.hasNext()) {
			String val = iterator.next();
			System.out.println("Forward list " + val);
		}
		int indexOfABD = players.indexOf("ABD");
		System.out.println("Index: " + indexOfABD);
		System.out.println("Before set " + players.get(3));

		players.set(5, "Shreyas");
		System.out.println("After set " + players.get(3));
		System.out.println("Remove element " + players.remove(2));

		System.out.println("Remove index element " + players.remove(5));
		System.out.println("Contains " + players.contains("padikkal"));
		System.out.println("Sublist " + players.subList(0, 5));
	}

}
