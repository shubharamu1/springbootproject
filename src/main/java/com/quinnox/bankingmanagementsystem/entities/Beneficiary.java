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
@Table(name="beneficiary")
public class Beneficiary {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="beneficiaryId")
	private Integer beneficiaryId;
	
	@Column(name="beneficiaryfirstName")
	private String beneficiaryfirstName;
	
	@Column(name="beneficiarylaststName")
	private String  beneficiarylastName;
	
	@Column(name="emailId")
	private String b_emailid;
	
	@Column(name="accountno")
	private int b_accountno;
	
	@Column(name="mobileno")
	private long mobileno;
	
	

}
