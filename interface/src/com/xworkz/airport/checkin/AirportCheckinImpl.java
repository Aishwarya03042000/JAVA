package com.xworkz.airport.checkin;

public class AirportCheckinImpl implements AirportCheckin {

	@Override
	public boolean checkinAtBoardingPoint() {
		System.out.println("running checkinAtBoardingPass frame ");
		return true;
	}

	@Override
	public boolean collectBoardingPass(int tickets) {
		System.out.println("running collectBoardingPass frame");
		return true;
	}

}
