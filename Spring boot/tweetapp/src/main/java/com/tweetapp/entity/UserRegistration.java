package com.tweetapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Document(collection = "UserRegistration")
public class UserRegistration {
	@Id
	private String loginId;
	private String firstName;
	private String lastName;
	private int contactNumber;
	private String dob;
	private String email;
	private String password;

}
