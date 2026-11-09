package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Employee Clock in time
    private int startTime;

    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    // Derived getters
    public double getRegularHours() {
        return Math.min(hoursWorked, 40); // Regular hours is 40(max)
    }
    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }
    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5); // Overtime pays out at 1.5*
    }
    public void punchIn(int time) {
        startTime = time;
    }
    public void punchOut(int time) {
        int hoursWorkedThisShift = time - startTime;
        hoursWorked += hoursWorkedThisShift;
    }
}
