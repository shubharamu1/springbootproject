package com.quinnox.bankingmanagementsystem.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.quinnox.bankingmanagementsystem.dto.ResponseData;
import com.quinnox.bankingmanagementsystem.dto.TransactionDTO;

import com.quinnox.bankingmanagementsystem.services.TransactionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TransactionController {
	
	@Autowired
	private TransactionService service;
	
	@PostMapping("/transaction")
	public String addTransaction(@RequestBody TransactionDTO transaction) {
		service.addTransaction(transaction);
		return "transaction Added SuccesFully";
	}
	
	@GetMapping("/transactions")
	public ResponseData findAllTransactions() {
		ResponseData response = new ResponseData();
		response.setMsg("transactions data Received Successfully");
		response.setData(service.findAllTransactions());
		return response;
	}
	
	@GetMapping("/transaction/CustomerId")
	public ResponseData getTransactionbyId(int customer_id) {
		
		ResponseData response=new ResponseData();
		response.setMsg("transaction details recieved succefully");
		response.setData(service.getTransactionbyId(customer_id));
		return response;
	}
	
}
