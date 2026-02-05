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

    public void run() {
        while (true) {
            try {
                int option = employeeView.getOption();
                switch (option) {
                    case 1 -> create();
                    case 2 -> getAllEmployees();
                    case 0 -> {
                        for (char ch : "Exiting....".toCharArray()) {
                            Thread.sleep(200);
                            System.out.print(ch);
                        }
                        System.out.println();
                        System.exit(0);
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
