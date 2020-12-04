package com.quinnox.bankingmanagementsystem.services;

import java.util.List;

import com.quinnox.bankingmanagementsystem.dto.TransactionDTO;

import com.quinnox.bankingmanagementsystem.entities.Transactions;

public interface TransactionService {
	
	 public boolean addTransaction(TransactionDTO transaction);
		
		public List<Transactions> findAllTransactions();
		
	
		
		public List<Transactions> getTransactionbyId(int customerId);
	
	
}
