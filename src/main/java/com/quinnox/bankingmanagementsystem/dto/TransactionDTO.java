package com.quinnox.bankingmanagementsystem.dto;

import lombok.Data;

@Data
public class TransactionDTO {

	private int transactionId;
	private int amount;
	private String beneficiaryfirstName;
	private int customer_id;
	private int b_accountno;
	private String date;
	private String remarks;
	
}
