package view;

import model.Employee;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.util.List;

public class EmployeeView {

//    public void showEmployee(Employee employee){
//        Table table = new Table(
//                3, BorderStyle.CLASSIC
//        );
//        table.addCell(" Employee Detail ", 3);
//
//        table.addCell(" ID ");
//        table.addCell(employee.getId().toString(), 2);
//        table.addCell(" Name ");
//        table.addCell(employee.getName(), 2);
//        table.addCell(" Salary ");
//        table.addCell(employee.getSalary().toString(), 2);
//
//        System.out.println(table.render());
//    }

    public void showEmployees(List<Employee> employees){
        Table table = new Table(
                3, BorderStyle.CLASSIC
        );
        table.addCell(" ID ");
        table.addCell(" Name ");
        table.addCell(" Salary ");

        employees.forEach(employee -> {
            table.addCell(employee.getId().toString());
            table.addCell(employee.getName());
            table.addCell(employee.getSalary().toString());
        });

        System.out.println(table.render());
    }

}
