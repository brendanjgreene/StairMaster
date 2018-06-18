package com.greene.brendan.climbing_stairs.service;

import org.apache.log4j.Logger;

import com.greene.brendan.climbing_stairs.domain.StairsProcessor;
import com.greene.brendan.climbing_stairs.domain.ValidInput;
import com.greene.brendan.climbing_stairs.util.JSONUtil;

public class StairsServiceImpl implements StairsService {
	
	private static final Logger LOGGER = Logger.getLogger(StairsService.class);
	
	private JSONUtil util = new JSONUtil();

	public String getSteps(int[] stairs, int strides) {
		// TODO Auto-generated method stub
		LOGGER.info("In StairsServiceImpl getSteps()");
		String response = null;
		StairsProcessor sp = new StairsProcessor();
	    ValidInput vi = new ValidInput();
	    
	    if (vi.checkValidInput(stairs, strides)) {
	    	response="{\"message\":\"The minumum number of steps to reach the top of youe stairwell is " +Integer.toString(sp.getFlightsSteps(stairs, strides))+"\","
	    			+ "\"totalStrides\":"+Integer.toString(sp.getFlightsSteps(stairs, strides))+","
	    					+ "\"stairs\":"+util.getJSONForObject(stairs)+","
	    							+ "\"strides\":"+strides+"}";
	    	
	    	} else {
	    		String error = vi.error;
	    		response="{\"error\":\""+error+"\",\"message\":\"Error your Stairwell doesnt comply with the rules\",\"stairs\":"+util.getJSONForObject(stairs)+",\"strides\":"+strides+"}";
	        	System.out.println("invalid");
	        }
		return response;
	    }
	}


