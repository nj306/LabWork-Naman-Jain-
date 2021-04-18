package com.cg.es.repository;

import java.util.List;

import com.cg.es.entities.Customer;
import com.cg.es.error.CustomerNotFoundException;


public interface CustomerRepository {
	
	public boolean viewCustomer(int customerdId);
	public boolean updateCustomer(Customer customer);
	}

