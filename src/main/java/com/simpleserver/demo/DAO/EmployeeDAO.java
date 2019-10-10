package com.simpleserver.demo.DAO;

import org.springframework.stereotype.Repository;

import com.simpleserver.demo.model.Employee;
import com.simpleserver.demo.model.Employees;

@Repository
public class EmployeeDAO {
  private static Employees list = new Employees();

  static {
    list.getEmployeeList().add(new Employee(1, "Dude", "McGuy", "dude@gmail.com"));
    list.getEmployeeList().add(new Employee(2, "Kevin", "Donald", "kevin@gmail.com"));
    list.getEmployeeList().add(new Employee(3, "Spongebob", "Squarepants", "SS@gmail.com"));
  }

  public Employees getAllEmployees() {
    return list;
  }

  public void addEmployee(Employee employee) {
    list.getEmployeeList().add(employee);
  }
}