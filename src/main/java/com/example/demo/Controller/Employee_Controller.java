package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.Employee_repository;

@RestController
@RequestMapping("/emp")
public class Employee_Controller {

	@Autowired
	Employee_repository employee_repository;


	@GetMapping
	public List<Employee> getAllEmps() {
		return employee_repository.findAll();
	}

	@PostMapping("/insertemps")
	public String saveEmps(@RequestBody Employee employee) {
		 employee_repository.save(employee);
			return "Employee Added sucessfully";


	}

	@PutMapping("/updateemps")
	public Employee UpdateEmployee(@RequestBody Employee employee) {
		return employee_repository.save(employee);

	}

//	@DeleteMapping("/deletemp")
//	public void DeletEmps(@RequestBody Employee employee) {
//		employee_repository.delete(employee);
//	}
	
	@DeleteMapping("/deletemps")
    public String deletsEmp(@RequestParam Integer employeeId) {
		employee_repository.deleteById(employeeId);
		return "deletsucessfully";

	}
	
	@GetMapping("/findbyId")
    public Employee AllEmp(@RequestParam Integer  employeeId) {
		return employee_repository.findById(employeeId).get();
		
                
	}  


}