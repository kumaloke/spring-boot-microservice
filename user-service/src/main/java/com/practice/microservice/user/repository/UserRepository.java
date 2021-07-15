package com.practice.microservice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.microservice.user.entity.User;

/*
 * @Repository interface class to connect to DB using Jpa for 
 * Entity type (User) and primary key type (Long)
 * CRUD operations are inbuilt.
 * For other operation, define method like findByUserId to find user for given id.
 *   
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
