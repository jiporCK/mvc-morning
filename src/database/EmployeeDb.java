package database;

import model.entities.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDb {

    public static List<Employee> employees = new ArrayList<>(){{
        add(new Employee(
                "Ousa Messi",
                3000.00,
                LocalDate.of(2026, 1, 31)
        ));
        add(new Employee(
                "Philip Messi02",
                3500.00,
                LocalDate.of(2025, 12, 15)
        ));
        add(new Employee(
                "Kokoma",
                2700.00,
                LocalDate.now()
        ));
    }};

}
