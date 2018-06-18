package com.greene.brendan.climbing_stairs.domain;

public class Input {
	
	private int[] stairs;
	private int strides;
	
	
	public Input(int[] stairs, int strides){
		this.stairs = stairs;
		this.strides = strides;
	}
	
	public int[] getStairs() {
		return stairs;
	}
	
	public int getStrides() {
		return strides;
	}

}
