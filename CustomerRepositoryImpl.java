package com.cg.es.repository;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{

	@Override
	public boolean viewCustomer(int customerId) {
		try {
			sessionFactory.getCurrentSession().view(customerId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		try {
			sessionFactory.getCurrentSession().update(customer);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean addCustomer(Customer customer) 
	{
		try 
	{
		sessionFactory.getCurrentSession().add(customer);
		return true;
	} catch (Exception e) {
		return false;
	}
}
	
	@Override
	public boolean removeCustomer(int customerId){
		try {
			sessionFactory.getCurrentSession().remove(customerId);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer validateCustomer(String username, String password) {
		Session session = sessionFactory.openSession();
		
		Customer customer=(Customer)session.get(Customer.class, username);
		Customer customer=(Customer)session.get(Customer.class, password);
		session.close();
		return Customer;
	}
}
