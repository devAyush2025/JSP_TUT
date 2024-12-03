package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

		List<Customer> customer = theQuery.getResultList();

		return customer;

	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int Id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, Id);
		return theCustomer;
	}

	public String deleteCustomer(int Id) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();

		Customer theCustomer = currentSession.get(Customer.class, Id);
		currentSession.delete(theCustomer);

		return "Customer Delete with id " + Id;
	}
}
