package com.quinnox.bankingmanagementsystem.services;

import java.util.List;

import com.quinnox.bankingmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankingmanagementsystem.entities.Customer;

public interface CustomerServices {
	
public boolean addCustomer(CustomerDTO customer);
	
	public List<Customer> findAllCustomers();
	
	public boolean save(CustomerDTO customer);
	
	public Customer  getCustomerbyId(int customerId);
	
	public Customer getCustomerbyUsernamePassword(String username,String password);
	
	public boolean deleteCustomer(int customerId);
	
	public int customerTransaction(int balance,int accountno,int customerId);
	  
    
}
