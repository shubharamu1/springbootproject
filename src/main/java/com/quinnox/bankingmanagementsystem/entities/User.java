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
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loginId")
	private Integer loginId;
	
	@Column(name="username")
	private String username;
	@Column(name = "password")
	private String password;
	
	@Column(name = "role")
	private String role="admin";
	

}
