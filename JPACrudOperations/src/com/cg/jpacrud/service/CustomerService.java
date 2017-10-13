package com.cg.jpacrud.service;

import java.util.List;




import com.cg.jpacrud.entities.Customer;



public interface CustomerService {
	
	 void addCustomer(Customer customer);

	public abstract void updateCustomer(Customer customer);

	public abstract void removeCustomer(Customer customer);

	public abstract Customer findCustomerById(int id);

	public abstract List<Customer> getByPhone(long phone);

	 public abstract List<Customer> getByName(String name);

	List<Customer> getAll();
}
