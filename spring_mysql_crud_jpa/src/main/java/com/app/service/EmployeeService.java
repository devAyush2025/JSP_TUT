package com.app.service;

import java.util.List;

import com.app.model.Employee;

//import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeService{
	public List<Employee> findAll();
	 public Employee findById(int id);
	 public void save(Employee employee);
	 public void delete(int id);
	 public int getCount();
	 
	 
}
