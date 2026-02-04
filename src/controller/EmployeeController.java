package controller;

import dao.EmployeeDao;
import model.Employee;
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

    public void createEmployee(Scanner scanner) {
        System.out.print("Enter employee id: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        Double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, salary);

        employeeDao.create(newEmployee);
    }

    public void getAllEmployees() {
        employeeView.showEmployees(
                employeeDao.getAll()
        );
    }

}
