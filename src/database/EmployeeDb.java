package database;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDb {

    public static List<Employee> employees = new ArrayList<>(){{
        add(new Employee(1L, "Visak", 2700.00));
        add(new Employee(2L, "Chamroeun", 30000.55));
        add(new Employee(3L, "Rosa", 2800.99));
        add(new Employee(4L, "Reachnaldo", 9999.77));
        add(new Employee(5L, "Maneth", 4444.66));
    }};

}
