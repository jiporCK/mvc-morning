package view;

import model.entities.Employee;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    private final static Scanner scanner = new Scanner(System.in);

    public Employee displayEmployeeCreate() {
        System.out.print("[+] Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("[+] Enter Employee Salary: ");
        Double salary = Double.parseDouble(scanner.nextLine());

        System.out.print("[+] Enter Hire Date(Format: 2000-4-20): ");
        String hireDateStr = scanner.nextLine();
        String[] parts = hireDateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        LocalDate hireDate = LocalDate.of(year, month, day);

        return new Employee(name, salary, hireDate);
    }

    public void showEmployees(List<Employee> employees){
        Table table = new Table(
                4, BorderStyle.CLASSIC
        );
        table.addCell(" ID ");
        table.addCell(" Name ");
        table.addCell(" Salary ");
        table.addCell(" Hire Date ");

        employees.forEach(employee -> {
            table.addCell(employee.getId().toString());
            table.addCell(employee.getName());
            table.addCell(employee.getSalary().toString());
            table.addCell(employee.getHireDate().toString());
        });

        System.out.println(table.render());
    }

}
