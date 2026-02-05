package controller;

import model.dao.EmployeeDao;
import model.entities.Employee;
import view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {

    private final EmployeeDao employeeDao;
    private final EmployeeView employeeView;

    public EmployeeController(EmployeeDao employeeDao, EmployeeView employeeView) {
        this.employeeDao = employeeDao;
        this.employeeView = employeeView;
    }

    public void create() {
        Employee employee = employeeView.displayEmployeeCreate();

        employeeDao.create(employee);
    }

    public void getAllEmployees() {
        List<Employee> employees = employeeDao.getAll();

        employeeView.showEmployees(employees);
    }

}
