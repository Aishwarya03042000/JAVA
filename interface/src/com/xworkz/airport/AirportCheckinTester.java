package com.xworkz.airport;

import com.xworkz.airport.checkin.AirportCheckin;
import com.xworkz.airport.checkin.AirportCheckinImpl;

public class AirportCheckinTester {

	public static void main(String[] args) {

		AirportCheckin checkin = new AirportCheckinImpl();
		System.out.println(AirportCheckin.LUGGAGE_WEIGHT);
		checkin.checkinAtBoardingPoint();
		checkin.collectBoardingPass(2);
	}

}
