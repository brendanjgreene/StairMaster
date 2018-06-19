package com.greene.brendan.climbing_stairs;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.greene.brendan.climbing_stairs.integration.StairsEndpoint;

public class EndPointTest {
	
	StairsEndpoint testEndpoint = new StairsEndpoint();
	String legalJson;
	String illegalJson;
	String legalResponse;
	String illegalResponse;
	
	@BeforeClass
	public static void setup() {

	}
	
	@Before
	public void init() {
		
		legalJson = "{\"stairs\":[2,14,14,19,3,8,17,7,17,6,9,5],\"strides\": 3}";
		legalResponse = "{\"message\":\"The minumum number of steps to reach the top of your stairwell is 66\",\"totalStrides\":66,\"stairs\":[2,14,14,19,3,8,17,7,17,6,9,5],\"strides\":3}";
		illegalJson = "{\"stairs\":[2,14,14,19,3,8,17,7,17,60,9,5],\"strides\":32}";
		illegalResponse = "{\"error\":\" Invalid stride must be at least 1 and no more than 4.\",\"message\":\"Error your Stairwell doesnt comply with the rules\",\"stairs\":[2,14,14,19,3,8,17,7,17,60,9,5],\"strides\":32}";
	}

	@Test
	public void checkEndpoint() {
		
		assertEquals(legalResponse, testEndpoint.getSteps(legalJson));
		assertEquals(illegalResponse, testEndpoint.getSteps(illegalJson));
		
	}
	
	
	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public static void dispose() {
		
	}

}
