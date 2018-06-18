package com.greene.brendan.climbing_stairs.integration;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.greene.brendan.climbing_stairs.domain.Input;
import com.greene.brendan.climbing_stairs.service.StairsServiceImpl;
import com.greene.brendan.climbing_stairs.util.JSONUtil;

@Path("/calculate")
public class StairsEndpoint {
	
	private JSONUtil util = new JSONUtil();
	
	StairsServiceImpl service=new StairsServiceImpl();
	
	@Path("/json")
	@POST
	@Produces({ "application/json" })
	public String getSteps(String stairCase) {
		
		Input data = util.getObjectForJSON(stairCase, Input.class);
		
		String jsonString = service.getSteps(data.getStairs(), data.getStrides());
		return jsonString;
		
	}

}