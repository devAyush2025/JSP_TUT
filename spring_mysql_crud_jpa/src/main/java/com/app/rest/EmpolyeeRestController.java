package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmpolyeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/employees",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> findAll(){
		List<Employee>list = employeeService.findAll();
		return list;
	}
	
	@GetMapping(path = "/employees/{empId}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Employee findByid(@PathVariable int empId) {
		Employee emp =  employeeService.findById(empId);
		
		if(emp==null) {
			throw new RuntimeException("Employee Not exists");
		}
		else {
			return emp;
		}
	}
	
	@PostMapping(path = "/employees",produces = {MediaType.APPLICATION_JSON_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE})
	public  Employee addEmp(@RequestBody Employee emp) {
		emp.setId(0);
		employeeService.save(emp);
		return emp;
	}
	
	@PutMapping(path = "/employees")
	public Employee updateEmp(@RequestBody Employee emp) {
			
		employeeService.save(emp);
		
		return emp;
	}
	@DeleteMapping(path = "/employees/{empId}")
	public String deleteEmp( @PathVariable int empId) {
		Employee e = employeeService.findById(empId);
		if(e== null) {
			return empId+" Doesn't Exists";
		}
		employeeService.delete(empId);
		return "Delete successfully with id"+empId;
		
	}
	
	@GetMapping(path = "/employees/count")
	public String getEmpcount() {
		int count = employeeService.getCount();
		return "Employee Count ="+count;
	}
	
}
