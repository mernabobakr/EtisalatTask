package com.example.task.service;

import com.example.task.Mappers.Mapper;
import com.example.task.dto.EmployeeDto;
import com.example.task.entity.Employee;
import com.example.task.exception.NotFoundException;
import com.example.task.repository.EmployeeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepo employeeRepo;
  private EmployeeDto employeeDto;
  private Mapper mapper;

  public List<Employee> findAll(){
    return employeeRepo.findAll();

  }

  public EmployeeDto getEmployeeById(int id) throws NotFoundException {

    try {
EmployeeDto employee =mapper.convertToDto(employeeRepo.findById(id).get());
      return employee;

    } catch (Exception e) {
      throw new NotFoundException("can't find employee with this id");
    }
  }

/*

  public Employee getEmployeeById(int id) throws NotFoundException {

    try {
      Employee employee =employeeRepo.findById(id).get();
      return employee;

    } catch (Exception e) {
      throw new NotFoundException("can't find employee with this id");
    }
  }

*/
}
