package com.greene.brendan.climbing_stairs.domain;

public class ValidInput {
	
	private String error="";
	
	public boolean checkValidFloors(int[] stairs) {
		int floors = stairs.length;
		if (floors<1 || floors>30) {
			setError(getError().concat(" Invalid Floors must have at least 1 and no more than 30."));
			return false;
		}
		return true;
	}
	
	public boolean checkValidSteps(int[] stairs) {
		for (int stair : stairs) {
			if (stair<1||stair>20) {
				setError(getError().concat(" Invalid Flight must have at least 1 and no more 20 Steps."));
				return false;
			}
		}
		return true;
	}
	
	public boolean checkValidStrides(int strides) {
		if (strides<1||strides>4) {
			setError(getError().concat(" Invalid stride must be at least 1 and no more than 4."));
			return false;
		}
		return true;
	}
	
	public boolean checkValidInput(int[] stairs, int strides) {
		return ((checkValidStrides(strides)) && (checkValidSteps(stairs)) && (checkValidFloors(stairs)) );
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
