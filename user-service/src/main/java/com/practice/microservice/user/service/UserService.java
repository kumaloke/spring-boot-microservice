package com.practice.microservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.microservice.user.VO.Department;
import com.practice.microservice.user.VO.ResponseTemplateVO;
import com.practice.microservice.user.entity.User;
import com.practice.microservice.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/*
 * This is a service class (@Service) to serve bridge between Repository and Controller.
 * @Slf4j is used to enable logging.
 * @Autowired is used to bind (default constructor) object with this.
 * ResponseTemplateVO : Value Object class is created to fetch cross service dependency 
 *                      like user has department information.
 * RestTemplate Bean is @Autowired to enable rest API execution.
 * @Autowired is used to bind (default constructor) object with this. *  
 */

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		log.info("Inside saveUser method of UserService.");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment method of UserService.");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		
		Department department = 
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), 
						Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}

}
