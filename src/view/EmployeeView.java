package view;

import model.Employee;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

public class EmployeeView {

    public void showEmployee(Employee employee){
        Table table = new Table(
                3, BorderStyle.CLASSIC
        );
        table.addCell(" Employee Detail ", 3);

        table.addCell(" ID ");
        table.addCell(employee.getId().toString(), 2);
        table.addCell(" Name ");
        table.addCell(employee.getName(), 2);
        table.addCell(" Salary ");
        table.addCell(employee.getSalary().toString(), 2);

        System.out.println(table.render());
    }

}
