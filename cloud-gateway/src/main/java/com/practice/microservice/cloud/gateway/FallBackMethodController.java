package com.practice.microservice.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * This controller defines fallback method on actual API not alive.  
 */

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return "User service is taking longer than expected." +
				" Please try after some time.";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return "Department service is taking longer than expected." +
				" Please try after some time.";
	}
}
