package com.app.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> list = employeeRepository.findAll();
		return list;
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub

		Optional<Employee> o = employeeRepository.findById(id);

		if (o.isEmpty()) {
			return null;
		} else {
			System.out.println("o = " + o);
			Employee e = o.get();
			return e;
		}
	}

	

	@Override
	@Transactional
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
