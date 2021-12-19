package com.ska.CourierManagementSystem.Models;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Date;

@Entity
public class Employee {

    private int employeeID;
    private String Name;
    private Date DOB;
    private double Salary;
    private EmployeeDescriptor employeeDescriptor;

    @Id
    @GeneratedValue
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeDescID")
    public EmployeeDescriptor getEmployeeDescriptor() {
        return employeeDescriptor;
    }

    public void setEmployeeDescriptor(EmployeeDescriptor employeeDescriptor) {
        this.employeeDescriptor = employeeDescriptor;
    }
}
