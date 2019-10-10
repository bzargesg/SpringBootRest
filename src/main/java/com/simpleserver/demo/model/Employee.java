package com.simpleserver.demo.model;

public class Employee {
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;

  public Employee() {

  }

  public Employee(Integer id, String firstName, String lastName, String email) {
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return this.id;
  }

  public String getfirstName() {
    return this.firstName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public String getemail() {
    return this.email;
  }

  @Override
  public String toString() {
    return "Employee [id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email="
        + this.email + "]";
  }
}