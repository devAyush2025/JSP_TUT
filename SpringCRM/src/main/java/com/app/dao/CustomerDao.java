package com.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.entity.Customer;


public interface CustomerDao  {
	public List<Customer> getCustomer();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int Id);
	public String deleteCustomer(int Id);
}
