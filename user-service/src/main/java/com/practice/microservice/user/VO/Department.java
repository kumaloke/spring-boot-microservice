package com.practice.microservice.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Data: helps to create getter/setter
 * @AllArgsConstructor/@NoArgsConstructor: helps to create constructors.
 * Regular class with department information. Will be used to store information 
 * fetched using RestTemplate.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;	
}
