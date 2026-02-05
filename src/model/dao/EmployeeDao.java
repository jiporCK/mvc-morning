package model.dao;

import model.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    void create(Employee employee);
    List<Employee> getAll();

}
