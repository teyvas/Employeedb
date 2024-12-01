package com.Alatoo;

import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        try {
            // Create a new employee
            Employee newEmployee = new Employee("John Doe", "Developer", 75000,
                    new SimpleDateFormat("yyyy-MM-dd").parse("2023-11-01"));
            employeeData.createEmployee(newEmployee);

            // Read employee by ID
            Employee employee = employeeData.getEmployeeById(1);
            System.out.println("Retrieved Employee: " + employee);

            // Read all employees
            List<Employee> employees = employeeData.getAllEmployees();
            System.out.println("All Employees:");
            employees.forEach(System.out::println);

            // Update employee
            if (employee != null) {
                employee.setName("John Smith");
                employee.setSalary(80000);
                employeeData.updateEmployee(employee);
            }

            // Delete employee
            employeeData.deleteEmployee(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
