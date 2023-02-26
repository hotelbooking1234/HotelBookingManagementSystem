package com.cg.hbm.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userModule")
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String firstName;
	private String lastName;
	private String password;
	private long phoneNumber;
	private String gender;
	private String emailId;
	private String userRole;

	
	

	public User(String firstName, String lastName, String password, long phoneNumber, String gender,String emailId,String userRole) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.emailId=emailId;
		this.userRole = userRole;
		
	}

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String password, String emailId,String userRole) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailId = emailId;
		this.userRole = userRole;
	}
	
	


}