package com.example.task.controller;

import com.example.task.dto.EmployeeDto;
import com.example.task.entity.Employee;
import com.example.task.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping(value = { "", "/" })
  public ResponseEntity<List<Employee>> getAllEmployees() {
    List<Employee> result = employeeService.findAll();
    return new ResponseEntity<>(result, HttpStatus.CREATED);
  }
  @GetMapping("/{id}")
  public ResponseEntity<Employee> getEmplyeeById(@PathVariable int id) {

    Employee result = employeeService.getEmployeeById(id);
    return new ResponseEntity<>(result, HttpStatus.OK);
  }


}
