package com.cg.jpacrud.dao;

import java.util.List;

import com.cg.jpacrud.entities.Customer;


public interface CustomerDao {

	public abstract Customer getCustomerById(int id);

	public abstract void addCustomer(Customer customer);

	public abstract void removeCustomer(Customer customer);

	public abstract void updateCustomer(Customer customer);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

	public abstract List<Customer> getByPhone(long phone);

	public abstract List<Customer> getByName(String name);

	

	public abstract List<Customer> getAll();

	

	


}
