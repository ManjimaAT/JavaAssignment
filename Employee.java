package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Emp {
    private int id;
    private String name;
    private double salary;
    private String skill;

    public Emp(int id, String name, double salary, String skill) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSkill() {
        return skill;
    }
}

public class Employee {
    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<>();
        employees.add(new Emp(1, "Anu", 50000, "Java"));
        employees.add(new Emp(2, "Bob", 60000, "Python"));
        employees.add(new Emp(3, "Priya", 65000, "Python"));
        employees.add(new Emp(4, "David", 62000, "C++"));
        employees.add(new Emp(5, "Maria", 55000, "Python"));
        employees.add(new Emp(6, "Riju", 59000, "Java"));

        Optional<List<Emp>> pythonEmployeesOptional = Optional.of(
                employees.stream()
                        .filter(employee -> "Python".equals(employee.getSkill()))
                        .toList()
        );

        pythonEmployeesOptional.ifPresentOrElse(
                pythonEmployees -> {
                    System.out.println("Employees with skill Python found:");
                    pythonEmployees.forEach(employee -> {
                        System.out.println("ID: " + employee.getId());
                        System.out.println("Name: " + employee.getName());
                        System.out.println("Salary: " + employee.getSalary());
                        System.out.println("Skill: " + employee.getSkill());
                        System.out.println();
                    });
                },
                () -> System.out.println("No employees with skill Python found")
        );
    }
}


