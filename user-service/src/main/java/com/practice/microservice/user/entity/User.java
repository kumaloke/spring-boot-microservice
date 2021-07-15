package com.practice.microservice.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * This is an entity (@Entity) class for user.
 * @Data: helps to create getter/setter
 * @AllArgsConstructor/@NoArgsConstructor: helps to create constructors.
 * @Id: defines primary key.
 * @GenerateValue: allow to generate key automatically.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String departmentId;
}
