package model.dao;

import database.EmployeeDb;
import model.entities.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(Employee employee) {
        EmployeeDb.employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeDb.employees;
    }

    @Override
    public boolean deleteById(Long id) {
        return EmployeeDb.employees
                .removeIf(employee -> employee.getId().equals(id));
    }

}
