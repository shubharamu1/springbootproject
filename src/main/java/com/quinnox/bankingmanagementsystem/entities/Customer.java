package com.quinnox.bankingmanagementsystem.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customerId")
	private int customerId;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="mobileno")
	private long mobileno;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="adharno")
	private long adharno;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="role",columnDefinition = "varchar(20) default 'user'")
	private String role;
	    
	@Column(name="address")
	private String address;
	
	@Column(name="accountno")
	private int accountno;
	
	@Column(name="pin")
	private int pin;
	
	@Column(name="balance")
	private int balance;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	

	

}

