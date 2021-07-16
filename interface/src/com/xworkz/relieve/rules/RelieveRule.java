package com.xworkz.relieve.rules;

public interface RelieveRule {

	int NOTICE_PERIOD_DAYS = 60;

	boolean completedBond();

	int servedNoticePeriod();

}
