package com.swagger.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.entities.Employee;
import com.swagger.services.EmployeeService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	@Operation(summary = "simple api call")
	public String welcome() {
		return "employee API called";
	}
	@GetMapping("/all")
	@Operation(summary = "Get all Employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAll();
	}
	@GetMapping("/{id}")
	@Operation(summary = "Get Employee by id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the book", 
					content = {@Content(mediaType = "application/json",
					schema = @Schema(implementation = Employee.class))})
	})
	public Optional<Employee> welcome(@PathVariable int id) {
		return employeeService.getEmpById(id);
	}
	@PostMapping("/add")
	@Operation(summary = "Add an Employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmp(employee);
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Delete an Employee")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmpById(id);
	}
	@PutMapping("/{id}")
	@Operation(summary = "Update an Employee")
	public String updateEmployee(@RequestBody Employee e,@PathVariable int id) {
		return employeeService.updateEmp(e,id);
	}


}
