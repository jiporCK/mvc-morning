package controller;

import model.dao.EmployeeDao;
import model.entities.Employee;
import view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

//    private final Employee employee;
    private final EmployeeDao employeeDao;
    private final EmployeeView employeeView;

//    public EmployeeController(Employee employee, EmployeeView employeeView) {
//        this.employee = employee;
//        this.employeeView = employeeView;
//    }
    public EmployeeController(EmployeeDao employeeDao, EmployeeView employeeView) {
        this.employeeDao = employeeDao;
        this.employeeView = employeeView;
    }

    public void getAllEmployees() {
        employeeView.showEmployees(
                employeeDao.getAll()
        );
    }

}
