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
		//System.out.println("total Landind Strides " + landingSteps);
		//System.out.println("total Flights Strides " + allFlightSteps);
		int totalStrides = landingSteps + allFlightSteps;
		//System.out.println("Total Strides " + totalStrides);
		return totalStrides;
		
	}
	

}
