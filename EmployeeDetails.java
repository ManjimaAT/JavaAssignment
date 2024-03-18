package org.example;

import java.util.*;

class Employee {
    private String id;
    private String name;
    private double salary;
    private String department;

    public Employee(String id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        // Sample employee records
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("001", "Anu", 50000, "HR"));
        employees.add(new Employee("002", "Aleena", 60000, "Finance"));
        employees.add(new Employee("003", "Vijay", 55000, "IT"));
        employees.add(new Employee("004", "Roy", 70000, "Marketing"));
        employees.add(new Employee("001", "Anu", 50000, "HR")); // Duplicate entry

        // Step 1: Store the employee IDs to one collection
        Set<String> employeeIDs = new HashSet<>();
        for (Employee emp : employees) {
            employeeIDs.add(emp.getId());
        }
        List<String> sortedEmployeeIDs = new ArrayList<>(employeeIDs);
        Collections.sort(sortedEmployeeIDs, Collections.reverseOrder());
        Map<String, Employee> employeeMap = new HashMap<>();
        for (Employee emp : employees) {
            employeeMap.put(emp.getId(), emp);
        }
        for (String id : sortedEmployeeIDs) {
            Employee emp = employeeMap.get(id);
            System.out.println(emp);
        }
    }
}

