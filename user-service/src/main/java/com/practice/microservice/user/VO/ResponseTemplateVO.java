package com.practice.microservice.user.VO;

import com.practice.microservice.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * This class will hold information about user and department. 
 * @Data: helps to create getter/setter
 * @AllArgsConstructor/@NoArgsConstructor: helps to create constructors. * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private User user;
	private Department department;	
}
