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
@Table(name="transaction")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transactionId")
	private int transactionId;
	
	@Column(name="customer_id")
	private int customer_id;
	
	@Column(name="beneficiaryfirstName")
	private String beneficiaryfirstName;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name="b_accountno")
	private int b_accountno;
	
	@Column(name="date")
	private String date;
	
//	@Column(name="credit", columnDefinition="Integer default '0'")
//	private int credit;
	
//	@Column(name="debit")
//	private int debit;

	@Column(name="remarks")
	private String remarks;
	
	
}
