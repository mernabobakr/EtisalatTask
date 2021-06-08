package com.example.task.dto;

import com.example.task.entity.Department;


public class EmployeeDto {
  private int id;

  private String name;

  private String jobTitle;

  private int salary;

  private DepartmentDto department;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public DepartmentDto getDepartment() {
    return department;
  }

  public void setDepartment(DepartmentDto department) {
    this.department = department;
  }
}
