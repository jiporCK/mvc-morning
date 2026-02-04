import controller.EmployeeController;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;
import view.EmployeeView;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employeeDao, employeeView);

        controller.createEmployee(scanner);
        controller.getAllEmployees();

    }
}
