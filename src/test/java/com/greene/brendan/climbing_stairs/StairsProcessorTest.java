package com.greene.brendan.climbing_stairs;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.greene.brendan.climbing_stairs.domain.StairsProcessor;

public class StairsProcessorTest {
	
	StairsProcessor processor;
	int [] testInput = {17};
	int [] testInput2 = {17, 17};
	int [] testInput3 = {4,9,8,11,7,20,14};
	int StepsPerStride;
	
	
	@BeforeClass
	public static void beforeClass(){
		
	}
	
	@Before
	public void before(){
		
		processor = new StairsProcessor();
		StepsPerStride = 3;
		
	}
	
	@Test
	public void testProcessor(){
		
		assertEquals(6, processor.getFlightsSteps(testInput, StepsPerStride));
		assertEquals(14, processor.getFlightsSteps(testInput2, StepsPerStride));
		StepsPerStride = 2;
		assertEquals(50, processor.getFlightsSteps(testInput3, StepsPerStride));
		
	}
	
	@After
	public void after(){
		
	}
	
	@AfterClass
	public static void afterClass(){
		
	}

}
