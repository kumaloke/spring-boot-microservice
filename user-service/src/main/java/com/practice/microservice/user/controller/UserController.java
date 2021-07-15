package com.practice.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservice.user.VO.ResponseTemplateVO;
import com.practice.microservice.user.entity.User;
import com.practice.microservice.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

/*
 * @RestContrller is defined to enable rest based controller.
 * @RequestMapping is used to define base rest uri.
 * @Slf4j is used to enable logging.
 * @Autowired is used to bind controller with service.
 * @PostMapping is used to define uri for post rest API.
 * @RequestBody is used to store post request body as object.
 * @GetMapping is used to define uri for get request.
 * @PathVariable is used to access path variable and store in local variable.  
 */

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user)
	{
		log.info("Inside saveUser method of UserController.");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId)
	{
		log.info("Inside getUserWithDepartment method of UserController.");
		return userService.getUserWithDepartment(userId);
	}

}
