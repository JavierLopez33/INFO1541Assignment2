package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {

    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);

    @Test
    void calculateWeeklyPay() {
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    void holidayBonus() {
        double holidayBonusValue = emp.holidayBonus();
        double roundedBonus = (double)Math.round (holidayBonusValue * 100 ) / 100;
        assertEquals(2164.54,roundedBonus);
    }
}