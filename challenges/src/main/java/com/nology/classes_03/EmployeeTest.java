package com.nology.classes_03;



import jdk.jfr.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    public Employee manager;
    public Employee salesRep;
    public Employee intern;


    @BeforeEach
    void setUp() {
        this.manager = new Employee("Karen", "Manager", 10, 10, 400);
        this.salesRep = new Employee("Judy", "Sales Rep", 9, 2, 30);
        this.intern = new Employee("Jilly", "Intern", 7, 1, 2);
    }

    // Testing the Fields and the Constructor
    // You will have to uncomment the tests below once you have added the fields and constructor

    @Test
    void Employee_ValidFields_nameMatches() {
        assertEquals("Karen", manager.name);
    }

    @Test
    void Employee_ValidFields_positionMatches() {
        assertEquals("Manager", manager.position);
    }

    @Test
    void Employee_ValidFields_ratingMatches() {
        assertEquals(10, manager.rating);
    }

    @Test
    void Employee_ValidFields_yearsEmployedMatches() {
        assertEquals(10, manager.yearsEmployed);
    }

    @Test
    void Employee_ValidFields_completedDealsMatches() {
        assertEquals(400, manager.completedDeals);
    }

    // Testing isPromotable

    @Test
    void isPromotable_ValidPromotion_ReturnsTrue() {
        boolean managerResult = this.manager.isPromotable();
        assertTrue(managerResult);

        boolean salesRepResult = this.salesRep.isPromotable();
        assertTrue(salesRepResult);
    }

    @Test
    void isPromotable_InValidPromotion_ReturnsFalse() {
        boolean internResult = this.intern.isPromotable();
        assertFalse(internResult);
    }

    // Testing calculateDealsPerYear

    @Test
    void calculateDealsPerYear_ValidFields_ReturnsSumOfDeals() {
        int managerResult = this.manager.calculateDealsPerYear();
        assertEquals(40, managerResult);

        int salesRepResult = this.salesRep.calculateDealsPerYear();
        assertEquals(15, salesRepResult);

        int internResult = this.intern.calculateDealsPerYear();
        assertEquals(2 ,internResult);
    }

    // Testing hasBonusQualification

    @Test
    void hasBonusQualification_ValidBonus_ReturnsTrue() {
        boolean managerResult = this.manager.hasBonusQualification();
        assertTrue(managerResult);
    }

    @Test
    void hasBonusQualification_InvalidBonus_ReturnsFalse() {
        boolean salesRepResult = this.salesRep.hasBonusQualification();
        assertFalse(salesRepResult);

        boolean internResult = this.intern.hasBonusQualification();
        assertFalse(internResult);
    }
}