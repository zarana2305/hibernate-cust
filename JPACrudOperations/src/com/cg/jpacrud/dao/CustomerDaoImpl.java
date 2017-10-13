package com.cg.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;





import com.cg.jpacrud.entities.Customer;



public class CustomerDaoImpl implements CustomerDao {

	private EntityManager entityManager;
	public CustomerDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	@Override
	public void addCustomer(Customer customer) {
		entityManager.persist(customer);
		
	}

	@Override
	public void removeCustomer(Customer customer) {
		entityManager.remove(customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		entityManager.merge(customer);
		
	}
	
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}
	
	@Override
	public List<Customer> getByPhone(long phone) {
		String qStr = "SELECT c FROM Customer c WHERE c.phone=:abc";
		TypedQuery<Customer> query = entityManager.createQuery(qStr, Customer.class);
		query.setParameter("abc", phone);
		List<Customer> customerList = query.getResultList();
		return customerList;
	}

	@Override
	public List<Customer> getByName(String name) {
		String q = "SELECT n FROM Customer n WHERE n.name=:key_name";
		TypedQuery<Customer> query = entityManager.createQuery(q, Customer.class);
		query.setParameter("key_name", name);
		List<Customer> nameList = query.getResultList();
		return nameList;
	}

	@Override
	public List<Customer> getAll() {
		String q = "SELECT n FROM Customer n";
		TypedQuery<Customer> query = entityManager.createQuery(q, Customer.class);
		List<Customer> fullList = query.getResultList();
		return fullList;}
	
}
