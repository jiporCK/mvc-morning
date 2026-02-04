import controller.EmployeeController;
import model.Employee;
import view.EmployeeView;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, employeeView);

        controller.createEmployee(scanner);
        controller.showEmployee();

    }

}
