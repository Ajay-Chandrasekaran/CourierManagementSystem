package com.ska.CourierManagementSystem.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDescriptor {

    private int employeeDescID;
    private String role;
    private String Department;

    @Id
    @GeneratedValue
    public int getEmployeeDescID() {
        return employeeDescID;
    }

    public void setEmployeeDescID(int employeeDescID) {
        this.employeeDescID = employeeDescID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
