package com.greene.brendan.climbing_stairs.domain;

public class StairsProcessor {
	
	public int getFlightsSteps(int[] stairs, int strides) {
		
		int floors = stairs.length;
		int allFlightSteps=0;
		for (int stair : stairs) {
			FlightProcessor fp = new FlightProcessor();
			allFlightSteps += fp.stridesInFlight(stair, strides);
		}
		int landingSteps = (floors-1)*2;
		return landingSteps+allFlightSteps;
		
	}
	

}
