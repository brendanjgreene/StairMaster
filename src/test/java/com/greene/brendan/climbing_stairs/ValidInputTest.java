package com.greene.brendan.climbing_stairs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.greene.brendan.climbing_stairs.domain.ValidInput;

public class ValidInputTest {
	
	ValidInput steps;
	int[] legalSteps = {1,1,1,2,3};
	int[] legalFlight = {1,1,1,2,3,4,5,6,7,8,9,1,1,2,3,4,5,6,7,8,9,};
	int legalStride;
	int[] manySteps = {1,1,1,2,30};
	int[] manyFlight = {1,1,1,2,3,4,5,6,7,8,9,1,1,1,2,3,4,5,6,7,8,9,1,1,1,2,3,4,5,6,7,8,9,1,1,1,2,3,4,5,6,7,8,9,1,1,1,2,3,4,5,6,7,8,9,};
	int bigStride;
	
	@BeforeClass
	public static void setup() {

	}
	
	@Before
	public void init() {
		
		steps = new ValidInput();
		legalStride = 3;
		bigStride = 5;
		
	}

	@Test
	public void checkValidInput() {
		
		assertTrue(steps.checkValidSteps(legalSteps));
		
		assertTrue(steps.checkValidFloors(legalFlight));
		
		assertTrue(steps.checkValidStrides(legalStride));
		
		assertFalse(steps.checkValidSteps(manySteps));
		
		assertFalse(steps.checkValidFloors(manyFlight));
		
		assertFalse(steps.checkValidStrides(bigStride));
		
	}
	
	
	@After
	public void cleanUp() {
		
	}
	
	@AfterClass
	public static void dispose() {
		
	}

}
