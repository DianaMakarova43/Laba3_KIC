package com.company.myfirstsipringapp.service;

import java.util.List;

import com.company.myfirstsipringapp.entity.Employee;
import com.company.myfirstsipringapp.excaption.EmployeeNotFoundException;

public interface EmployeeService {

    List<Employee> listAll();
    void save(Employee employee);
    Employee get(Integer id) throws EmployeeNotFoundException;
    void delete(Integer id) throws EmployeeNotFoundException;
}
