import controller.EmployeeController;
import model.dao.EmployeeDao;
import model.dao.EmployeeDaoImpl;
import view.EmployeeView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController controller = new EmployeeController(employeeDao, employeeView);

        controller.run();

    }
}
