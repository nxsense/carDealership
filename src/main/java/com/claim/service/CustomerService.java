package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Customer;
import com.claim.repository.CustomerRepository;

@Service
public class CustomerService {

	//dependency injection
	@Autowired
	CustomerRepository customerRepository;
	
	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
		//links to /addCustomer form for purchase transaction
	}
	
	//displayAllCustomers
	//create this query/method in CustomerRepository Class
}
