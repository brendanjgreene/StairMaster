package com.greene.brendan.climbing_stairs.service;

import org.apache.log4j.Logger;

import com.greene.brendan.climbing_stairs.domain.StairsProcessor;
import com.greene.brendan.climbing_stairs.domain.ValidInput;

public class StairsServiceImpl implements StairsService {
	
	private static final Logger LOGGER = Logger.getLogger(StairsService.class);

	public String getSteps(int[] stairs, int strides) {
		// TODO Auto-generated method stub
		LOGGER.info("In StairsServiceImpl getSteps()");
		String result = null;
		StairsProcessor sp = new StairsProcessor();
	    ValidInput vi = new ValidInput();
	    if (vi.checkValidInput(stairs, strides)) {
	    	result="The minumum number of steps to reach the top of youe stairwell is " +Integer.toString(sp.getFlightsSteps(stairs, strides));
	    	
	    	} else {
	    		result="Error your Stairwell doesnt: comply with the rules:"
	    				+ "The stairwell must have between 1 and 30 flights inclusive. "
	    				+ "Each flight must have a maximum of 20 steps. "
	    				+ "You can only stride between 1 and 4 steps.";
	        	System.out.println("invalid");
	        }
		return result;
	    }
	}


