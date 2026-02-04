package dao;

import model.Employee;

import java.util.List;

public interface EmployeeDao {

    void create(Employee employee);
    List<Employee> getAll();

}
