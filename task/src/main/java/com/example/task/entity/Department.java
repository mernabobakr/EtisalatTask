package com.example.task.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "department")
public class Department {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "department_name")
  private String departmentName;

  @OneToOne
  @JoinColumn(name = "manager_id", referencedColumnName = "id")
  private Employee manager;

  @Column(name = "number_of_employees")
  private int noOfEmployees;
  @JsonBackReference
  @OneToMany(targetEntity = Employee.class, mappedBy = "department", fetch = FetchType.LAZY)
  private List<Employee> employeeList;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setName(String departmentName) {
    this.departmentName = departmentName;
  }


  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public Employee getManager() {
    return manager;
  }

  public void setManager(Employee manager) {
    this.manager = manager;
  }

  public int getNoOfEmployees() {
    return noOfEmployees;
  }

  public void setNoOfEmployees(int noOfEmployees) {
    this.noOfEmployees = noOfEmployees;
  }

  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  public void setEmployeeList(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

}
