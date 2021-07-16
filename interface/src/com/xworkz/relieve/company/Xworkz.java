package com.xworkz.relieve.company;

import com.xworkz.relieve.rules.RelieveRule;

public class Xworkz {

	private RelieveRule rule;

	public Xworkz() {
		System.out.println("Created Xworkz");
	}

	public void employeeExit() {
		if (rule != null) {
			System.out.println("Rules exist can check and exit");
			boolean complete = this.rule.completedBond();
			int period = this.rule.servedNoticePeriod();
			if (complete && period >= RelieveRule.NOTICE_PERIOD_DAYS) {
				System.out.println("Employee can exit now");
			} else {
				System.out.println("Employee cannot exit, as rules are not followed");
			}
		} else {
			System.out.println("Rules not exist, cannot exit");
		}
	}

	public void setRule(RelieveRule rule) {
		this.rule = rule;
	}
}
