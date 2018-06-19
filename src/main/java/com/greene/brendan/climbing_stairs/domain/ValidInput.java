package com.greene.brendan.climbing_stairs.domain;

public class ValidInput {
	
	public String error="";
	
	public boolean checkValidFloors(int[] stairs) {
		int floors = stairs.length;
		if (floors<1 || floors>30) {
			error = error.concat(" Invalid Floors must have at least 1 and no more than 30.");
			return false;
		}
		return true;
	}
	
	public boolean checkValidSteps(int[] stairs) {
		for (int stair : stairs) {
			if (stair<1||stair>20) {
				error = error.concat(" Invalid Flight must have at least 1 and no more 20 Steps.");
				return false;
			}
		}
		return true;
	}
	
	public boolean checkValidStrides(int strides) {
		if (strides<1||strides>4) {
			error = error.concat(" Invalid stride must be at least 1 and no more than 4.");
			return false;
		}
		return true;
	}
	
	public boolean checkValidInput(int[] stairs, int strides) {
		return ((checkValidStrides(strides)) && (checkValidSteps(stairs)) && (checkValidFloors(stairs)) );
	}

}
