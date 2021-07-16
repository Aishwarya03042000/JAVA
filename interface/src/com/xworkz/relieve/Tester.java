package com.xworkz.relieve;

import com.xworkz.relieve.company.Xworkz;
import com.xworkz.relieve.employee.Developer;
import com.xworkz.relieve.rules.RelieveRule;

public class Tester {

	public static void main(String[] args) {

		RelieveRule reliveRule = new Developer("Aish");

		Xworkz xworkz = new Xworkz();
		xworkz.setRule(reliveRule); // null,ref
		xworkz.employeeExit();
	}

}
