package com.simpleserver.demo;

import java.util.ArrayList;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.simpleserver.demo.DAO.EmployeeDAO;
import com.simpleserver.demo.model.Employee;
import com.simpleserver.demo.model.Employees;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private EmployeeDAO employeeDao;

	// @GetMapping(value = "/hello")
	// public String getMethodName() {
	// return "Hello!";
	// }

	@GetMapping(path = "/", produces = "application/json")
	public ArrayList<String> getEmployees() {
		return this.employees;
	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> addEmployee(@RequestBody String employee) {
		String newEmployee = service.create(employee);
		this.employees.add(employee);

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
