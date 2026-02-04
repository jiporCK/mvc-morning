package controller;

import model.Employee;
import view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private final Employee employee;
    private final EmployeeView employeeView;

    public EmployeeController(Employee employee, EmployeeView employeeView) {
        this.employee = employee;
        this.employeeView = employeeView;
    }

    public void createEmployee(Scanner scanner) {
        System.out.print("Enter employee id: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        Double salary = Double.parseDouble(scanner.nextLine());

        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
    }

    public void showEmployee() {
        employeeView.showEmployee(employee);
    }

}
