package com.greene.brendan.climbing_stairs.domain;

public class FlightProcessor {
	
	public int stridesInFlight(int steps, int strides) {
		
	int regStrides = 0;
	if (steps >0 && steps<=20) {
		regStrides = steps / strides;
		if ((steps % strides) != 0) {
			regStrides += 1;
		} 
	}
	return regStrides;

}
}
