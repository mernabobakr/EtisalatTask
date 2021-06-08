package com.example.task.dto;

import com.example.task.entity.Employee;
import java.util.List;
import net.bytebuddy.build.ToStringPlugin.Exclude;


public class DepartmentDto {

  private int id;
  private String departmentName;
 // private EmployeeDto manager;
  private int noOfEmployees;

 // private List<EmployeeDto> employeeList;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }
/*
  public EmployeeDto getManager() {
    return manager;
  }

  public void setManager(EmployeeDto manager) {
    this.manager = manager;
  }
  */

  public int getNoOfEmployees() {
    return noOfEmployees;
  }

  public void setNoOfEmployees(int noOfEmployees) {
    this.noOfEmployees = noOfEmployees;
  }
/*
  public List<EmployeeDto> getEmployeeList() {
    return employeeList;
  }

  public void setEmployeeList(List<EmployeeDto> employeeList) {
    this.employeeList = employeeList;
  }
  */


}
