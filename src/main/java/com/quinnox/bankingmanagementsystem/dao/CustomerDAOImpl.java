package com.quinnox.bankingmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.bankingmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankingmanagementsystem.entities.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	EntityManager manager;
	

	@Override
	@Transactional
	public boolean addCustomer(CustomerDTO customer) {
		Customer customer2 = new Customer();
		BeanUtils.copyProperties(customer, customer2);
		manager.persist(customer2);
		return true;
	}

	@Override
	public List<Customer> findAllCustomers() {
		TypedQuery<Customer> query =  manager.createQuery("from Customer", Customer.class);
		return query.getResultList();
		
	}

	@Override
	@Transactional
	public boolean save(CustomerDTO customer) {
		Customer customer1 = manager.find(Customer.class,customer.getCustomerId());
		BeanUtils.copyProperties(customer, customer1);
		return true;
	}

	@Override
	@Transactional 
	public boolean deleteCustomer(int customerId) {
		Customer customer = manager.find(Customer.class, customerId);
		manager.remove(customer);
		return true;
	}

	@Override
	public Customer getCustomerbyId(int customerId) {
		Customer customer = manager.find(Customer.class, customerId);
		return customer;
		
	}

	@Override
	public Customer getCustomerbyUsernamePassword(String username, String password) {
		TypedQuery<Customer> query1=manager.createQuery("Select C From Customer C where C.username='"+username+"' and C.password='"+password+"'",Customer.class);
		
		return query1.getSingleResult();
	}

	@Override
	@Transactional
	public int customerTransaction(int balance, int accountno, int customerId) {
		Customer customer= manager.find(Customer.class, customerId);
		int mainbalance=customer.getBalance();
		int totalbalance=mainbalance-balance;
		customer.setBalance(totalbalance);
		
		Query query= manager.createQuery("UPDATE Customer SET balance=balance+'"+balance+"' where accountno='"+accountno+"'");
		int rows=query.executeUpdate();
		return rows;
		
	}

	

}
