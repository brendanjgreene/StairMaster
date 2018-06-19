package com.greene.brendan.climbing_stairs;

import com.greene.brendan.climbing_stairs.domain.StairsProcessor;
import com.greene.brendan.climbing_stairs.domain.ValidInput;

public class App 
{
    public static void main( String[] args )
    {
        
        
        int[] stairs = {2,14,14,14,3,8,19,16};
        int strides = 3;
        StairsProcessor sp = new StairsProcessor();
        ValidInput vi = new ValidInput();
        if (vi.checkValidInput(stairs, strides)) {
        	sp.getFlightsSteps(stairs, strides);
        }else {
        	System.out.println("invalid");
        }

    }
}
