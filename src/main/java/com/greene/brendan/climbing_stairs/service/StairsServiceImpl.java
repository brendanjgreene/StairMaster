package com.greene.brendan.climbing_stairs.service;

import com.greene.brendan.climbing_stairs.domain.StairsProcessor;
import com.greene.brendan.climbing_stairs.domain.ValidInput;
import com.greene.brendan.climbing_stairs.util.JSONUtil;

public class StairsServiceImpl implements StairsService {
		
	private JSONUtil util = new JSONUtil();

	public String getSteps(int[] stairs, int strides) {

		String response = null;
		StairsProcessor sp = new StairsProcessor();
	    ValidInput vi = new ValidInput();
	    
	    if (vi.checkValidInput(stairs, strides)) {
	    	response="{\"message\":\"The minumum number of steps to reach the top of your stairwell is " +Integer.toString(sp.getFlightsSteps(stairs, strides))+"\","
	    			+ "\"totalStrides\":"+Integer.toString(sp.getFlightsSteps(stairs, strides))+","
	    					+ "\"stairs\":"+util.getJSONForObject(stairs)+","
	    							+ "\"strides\":"+strides+"}";
	    	
	    	} else {
	    		String error = vi.getError();
	    		response="{\"error\":\""+error+"\",\"message\":\"Error your Stairwell doesnt comply with the rules\",\"stairs\":"+util.getJSONForObject(stairs)+",\"strides\":"+strides+"}";
	        }
		return response;
	    }
	}


