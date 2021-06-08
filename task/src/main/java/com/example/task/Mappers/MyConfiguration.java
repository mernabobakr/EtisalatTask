//package com.example.task.Mappers;
//import com.example.task.dto.DepartmentDto;
//import com.example.task.dto.EmployeeDto;
//import com.example.task.entity.Department;
//import com.example.task.entity.Employee;
//import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;
//
//import ma.glasnost.orika.MapperFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//
//public class MyConfiguration implements OrikaMapperFactoryConfigurer {
//
//
//  @Override
//  public void configure(MapperFactory orikaMapperFactory) {
//    orikaMapperFactory.classMap(Department.class, DepartmentDto.class).exclude("employeeList").exclude("manager")
//        .byDefault().register();
//    orikaMapperFactory.classMap(Employee.class, EmployeeDto.class).exclude("jobTitle")
//        .byDefault().register();
//  }
//}
//
//
