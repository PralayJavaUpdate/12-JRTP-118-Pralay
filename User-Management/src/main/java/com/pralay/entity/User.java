package com.pralay.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
@Data
@Entity
@Table(name="CONTACT_DTLS")
public class User {
	
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String firstName;
	private String lastName;
	private String emailid;
	private String phoneNo;
	private Date dateOfBirth;
	private Integer country;
	private Integer state;
	private Integer city;
	private String password;
	private String accountStatus;
	
	
		
	}
