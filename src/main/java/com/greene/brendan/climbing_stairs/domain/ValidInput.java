package com.greene.brendan.climbing_stairs.domain;

public class ValidInput {
	
	public boolean checkValidFloors(int[] stairs) {
		int floors = stairs.length;
		System.out.println(floors);
		if (floors<1 || floors>30) {
			System.out.println("Invalid Floors");
			return false;
		}
		System.out.println("valid Floors");
		return true;
	}
	
	public boolean checkValidSteps(int[] stairs) {
		for (int stair : stairs) {
			if (stair<1||stair>20) {
				System.out.println("invalid flight");
				return false;
			}
		}
		System.out.println("valid flight");
		return true;
	}
	
	public boolean checkValidStrides(int strides) {
		if (strides<1||strides>4) {
			System.out.println("invalid stride");
			return false;
		}
		System.out.println("valid stride");
		return true;
	}
	
	public boolean checkValidInput(int[] stairs, int strides) {
		if ((checkValidStrides(strides)) & (checkValidSteps(stairs)) & (checkValidFloors(stairs)) ) {
			return true;
		}
		return false;
	}

}
