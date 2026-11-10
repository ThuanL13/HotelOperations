package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void punchOutCalcWorks() {
        Employee employee = new Employee(67,"Michael Trevino",
                "Reception",24,0);
        employee.punchIn(8);
        employee.punchOut(24);

        assertEquals(16, employee.getHoursWorked());
    }
    @Test
    void multiShifts() {
        Employee employee = new Employee(67,"Michael Trevino",
                "Reception", 24,0);
        employee.punchIn(8);
        employee.punchOut(24);
        employee.punchIn(8);
        employee.punchOut(24);
        employee.punchIn(8);
        employee.punchOut(24);

        assertEquals(48, employee.getHoursWorked());
    }
}