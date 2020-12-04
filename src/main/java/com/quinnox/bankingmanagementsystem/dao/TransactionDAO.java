package com.quinnox.bankingmanagementsystem.dao;

import java.util.List;


import com.quinnox.bankingmanagementsystem.dto.TransactionDTO;

import com.quinnox.bankingmanagementsystem.entities.Transactions;

public interface TransactionDAO {
	
//	public int debitAmount(int customerId,String accountno,int debit);
//	
//	public int creditAmount(int customerId,String accountno,int credit);
//	//get all,getallbyId and addtransaction
//	
	
	 public boolean addTransaction(TransactionDTO transaction);
		
		public List<Transactions> findAllTransactions();
		
	
		
		public List<Transactions> getTransactionbyId(int customerId);
	
	
	
}
