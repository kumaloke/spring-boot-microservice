package com.practice.microservice.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/*
 * @SptringBootApplication is used to define application as spring boot.
 * @EnableEurekaClient is used to enable eureka client
 * @EnableHystrixDashboard is used to enable hystrix dashboard to monitor services.  
 */

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}

}
