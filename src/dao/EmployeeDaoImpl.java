package dao;

import database.EmployeeDb;
import model.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(Employee employee) {
        EmployeeDb.employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return EmployeeDb.employees;
    }
}
