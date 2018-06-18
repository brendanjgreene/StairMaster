package com.greene.brendan.climbing_stairs;

//import com.greene.brendan.climbing_stairs.domain.FlightProcessor;
import com.greene.brendan.climbing_stairs.domain.StairsProcessor;
import com.greene.brendan.climbing_stairs.domain.ValidInput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        //FlightProcessor fp = new FlightProcessor();
        //fp.stridesInFlight(19,2);
        
        int[] stairs = {2,14,14,14,3,8,19,16};
        int strides = 3;
        StairsProcessor sp = new StairsProcessor();
        ValidInput vi = new ValidInput();
        //System.out.println(vi.checkValidFloors(stairs));
        //System.out.println(vi.checkValidSteps(stairs));
        //System.out.println(vi.checkValidStrides(strides));;
        if (vi.checkValidInput(stairs, strides)) {
        	sp.getFlightsSteps(stairs, strides);
        }else {
        	System.out.println("invalid");
        }

    }
}
