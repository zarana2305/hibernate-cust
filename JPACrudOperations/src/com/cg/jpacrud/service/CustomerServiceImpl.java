package com.cg.jpacrud.service;


import java.util.List;

import com.cg.jpacrud.dao.CustomerDao;
import com.cg.jpacrud.dao.CustomerDaoImpl;
import com.cg.jpacrud.entities.Customer;


public class CustomerServiceImpl implements CustomerService{
	
	private CustomerDao dao;

	public CustomerServiceImpl() {
		dao = new CustomerDaoImpl();
	}


	@Override
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public Customer findCustomerById(int id) {
		//no need of transaction, as it's an read operation
				Customer customer  = dao.getCustomerById(id);
				return customer;}
@Override
	public void updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public void removeCustomer(Customer customer) {
		dao.beginTransaction();
		dao.removeCustomer(customer);
		dao.commitTransaction();
	}

	@Override
	public List<Customer> getByPhone(long phone) {
		return dao.getByPhone(phone);
	}


	@Override
	public List<Customer> getByName(String name) {
		return dao.getByName(name);
	}

	@Override
	public List<Customer>getAll() {
		return dao.getAll();
	}
	


}
