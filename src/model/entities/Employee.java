package model.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Long id;
    private String name;
    private Double salary;
    private LocalDate hireDate;

    public Employee(String name, Double salary, LocalDate hireDate) {
        this.id = new Random().nextLong(99999);
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }



}
