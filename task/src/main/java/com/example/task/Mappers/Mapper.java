package com.example.task.Mappers;


import com.example.task.dto.DepartmentDto;
import com.example.task.dto.EmployeeDto;
import com.example.task.entity.Department;
import com.example.task.entity.Employee;
import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
  MapperFacade mapper;


  public EmployeeDto convertToDto(Employee employee) {
    EmployeeDto employeeDto = mapper.map(employee, EmployeeDto.class);
    return employeeDto;
  }

  public Employee convertFromDto(EmployeeDto employeeDto) {
    Employee employee = mapper.map(employeeDto, Employee.class);
    return employee;
  }

  public DepartmentDto convertToDto(Department department) {
    DepartmentDto departmentDto = mapper.map(department, DepartmentDto.class);
    return departmentDto;
  }

  public Department convertFromDto(DepartmentDto departmentDto) {
    Department department = mapper.map(departmentDto, Department.class);
    return department;
  }


}
