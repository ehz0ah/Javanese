package oop;

import java.time.Period;
import java.time.LocalDate;

public class Employee {
    private final String name;
    private double salary;
    private final LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public int getYearsOfService() {
        return Period.between(this.hireDate, LocalDate.now()).getYears();
    }
}
