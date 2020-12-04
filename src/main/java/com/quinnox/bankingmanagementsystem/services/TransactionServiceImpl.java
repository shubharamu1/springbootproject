package com.quinnox.bankingmanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.bankingmanagementsystem.dao.TransactionDAO;
import com.quinnox.bankingmanagementsystem.dto.TransactionDTO;

import com.quinnox.bankingmanagementsystem.entities.Transactions;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDAO dao;

	@Override
	public boolean addTransaction(TransactionDTO transaction) {
		
		return dao.addTransaction(transaction);
	}

	@Override
	public List<Transactions> findAllTransactions() {
	
		return dao.findAllTransactions();
	}

	@Override
	public List<Transactions> getTransactionbyId(int customerId) {
		
		return dao.getTransactionbyId(customerId);
	}
	



}
