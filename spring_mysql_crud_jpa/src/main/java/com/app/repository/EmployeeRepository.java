package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query("select count(*) from Employee")
	public int getCount();
}
