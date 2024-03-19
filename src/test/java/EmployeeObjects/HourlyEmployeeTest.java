package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);

    @org.junit.jupiter.api.Test
    void addingPositiveEightHours() {
        emp.increaseHours(8);
        assertEquals(8.0, emp.getHoursWorked());
    }

    @org.junit.jupiter.api.Test
    void addingNegativeEightHours() {
        emp.increaseHours(-8);
        assertEquals(0.0, emp.getHoursWorked());
    }

    @org.junit.jupiter.api.Test
    void correctAnnualRaise() {
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @org.junit.jupiter.api.Test
    void incorrectAnnualRaise() {
        emp.annualRaise();
        assertEquals(35.00, emp.getWage());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPayWith35Hours() {
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPayWith45Hours() {
        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay());
    }
}