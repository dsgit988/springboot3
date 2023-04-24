package com.example.springcrud.dao;

import com.example.springcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
