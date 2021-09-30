package com.exemple.Week4Homework2;

import java.util.UUID;

public class Employee {
    private  UUID uuid;
    private String employeeName;
    private int employeeAge;
    private String employeeGender;
    private String employeeDepartment;
    private String employeeJob;

    /* public Employee(String employeeName, int employeeAge, String employeeGender, String employeeDepartment, String employeeJob) {
        this.uuid = uuid;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
        this.employeeJob = employeeJob; } */

    public UUID getuuid() {
        return uuid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeJob() {
        return employeeJob;
    }

    public void setEmployeeJob(String employeeJob) {
        this.employeeJob = employeeJob;
    }

    public void addEmployee (UUID uuid, String employeeName, int employeeAge, String employeeGender, String employeeDepartment, String employeeJob) {
        this.uuid = uuid;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeGender = employeeGender;
        this.employeeDepartment = employeeDepartment;
        this.employeeJob = employeeJob; }

    void displayEmployee(){
        System.out.println("Employee details: ");
        System.out.println("uuid: " + uuid);
        System.out.println("Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Gender: " + employeeGender);
        System.out.println("Department: " + employeeDepartment);
        System.out.println("Job: " + employeeJob);

    }
}
