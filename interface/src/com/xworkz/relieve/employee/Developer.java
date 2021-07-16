package com.xworkz.relieve.employee;

import com.xworkz.relieve.rules.RelieveRule;

public class Developer implements RelieveRule {

	private String name;

	public Developer(String name) {
		this.name = name;
	}

	@Override
	public boolean completedBond() {
		System.out.println(this.name + " Completed Bond");
		return true;
	}

	@Override
	public int servedNoticePeriod() {
		System.out.println(this.name + " Served notice period");
		return 60;

	}

}
