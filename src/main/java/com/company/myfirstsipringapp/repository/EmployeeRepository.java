package com.company.myfirstsipringapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.myfirstsipringapp.entity.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
    Long countById(Integer id);

}
