package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

    @Test
    void increaseSalesPositiveNum() {
        emp.increaseSales(25);
        assertEquals(25,emp.getSales());
    }

    @Test
    void increaseSalesNegativeNum() {
        emp.increaseSales(-25);
        assertEquals(0,emp.getSales());
    }

    @Test
    void holidayBonusShouldReturnZero() {
        assertEquals(0,emp.holidayBonus());
    }

    @Test
    void twoAnnualRaises() {
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(.0305,emp.getRate());
    }
}