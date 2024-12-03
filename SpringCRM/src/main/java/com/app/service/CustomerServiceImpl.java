package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CustomerDao;
import com.app.dao.CustomerDaoImpl;
import com.app.entity.Customer;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl  implements CustomerService{
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	@Transactional
	public List<Customer> getCustomer() {
	
		return  customerDao.getCustomer();
	}

	
	
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		
		customerDao.saveCustomer(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}
	
	public String deleteCustomer(int id) {
		return customerDao.deleteCustomer(id);
		
	}

}
