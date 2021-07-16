package com.xworkz.airport.checkin;

public interface AirportCheckin {

	double LUGGAGE_WEIGHT = 58.0;

	boolean collectBoardingPass(int tickets);

	boolean checkinAtBoardingPoint();

}
