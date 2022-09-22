package com.nology.classes_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // Uncomment the BeforeEach when you have completed the constructor

    @BeforeEach
    void setUp() {
        this.calculator = new Calculator(50, 20);
    }

//     Testing fields, constructor and getters
//     Uncomment the tests below when you have completed the getters

    @Test
    void getHasBattery_ValidInput_ReturnsTrueByDefault(){
       assertTrue(calculator.getHasBattery());
    }

    @Test
    void getFirstInput_ValidFields_ReturnsInitialValue(){
        double firstInput = calculator.getFirstInput();
        assertEquals(50, firstInput);
    }

    @Test
    void getSecondInput_ValidFields_ReturnsInitialValue(){
        double secondInput = calculator.getSecondInput();
        assertEquals(20, secondInput);
    }

//     Testing setters and getters
//     Uncomment the tests when you have completed the setters

    @Test
    void setHasBattery_ValidInput_ReturnsFalse(){
        calculator.setHasBattery(false);
        assertFalse(calculator.getHasBattery());
    }

    @Test
    void setHasBattery_ValidInput_ReturnsTrue(){
        calculator.setHasBattery(false);
        calculator.setHasBattery(true);
        assertTrue(calculator.getHasBattery());
    }

    @Test
    void setFirstInput_ValidInput_ReturnsNewValue() {
        calculator.setFirstInput(2000.20);
        double updatedFirstInput = calculator.getFirstInput();
        assertEquals(2000.20, updatedFirstInput);
    }

    @Test
    void setSecondInput_ValidInput_ReturnsNewValue() {
        calculator.setSecondInput(45);
        double updatedSecondInput = calculator.getSecondInput();
        assertEquals(45, updatedSecondInput);
    }

//     Testing calculateAddition
//     Uncomment the tests below when you have completed the calculateAddition method

    @Test
    void calculateAddition_ValidFields_ReturnsAddition() {
        double result = calculator.calculateAddition();
        assertEquals(70, result);
    }

    @Test
    void calculateAddition_UpdatedValidFields_ReturnsAddition() {
        calculator.setFirstInput(450.44);
        calculator.setSecondInput(.56);
        double result = calculator.calculateAddition();
        assertEquals(451, result);
    }

    @Test
    void calculateAddition_InvalidHasBattery_ReturnsNegativeOne() {
        calculator.setHasBattery(false);
        double result = calculator.calculateAddition();
        assertEquals(-1, result);
    }

//     Testing calculateDivision
//     Uncomment the tests below when you have completed the calculateDivision method


    @Test
    void calculateDivision_ValidFields_ReturnsDivision(){
        double result = calculator.calculateDivision();
        assertEquals(2.5, result);
    }

    @Test
    void calculateDivision_UpdatedValidFields_ReturnsDivision(){
        calculator.setFirstInput(10_000);
        calculator.setSecondInput(15);
        double result = calculator.calculateDivision();
        assertEquals(666.6666666666666, result);
    }

    @Test
    void calculateDivision_InvalidSecondInput_ReturnsZero(){
        calculator.setSecondInput(0);
        double result = calculator.calculateDivision();
        assertEquals(0, result);
    }

    @Test
    void calculateDivision_InvalidHasBattery_ReturnsNegativeOne(){
        calculator.setHasBattery(false);
        double result = calculator.calculateDivision();
        assertEquals(-1, result);
    }

    @Test
    void calculateDivision_InvalidHasBatteryAndSecondInput_ReturnsNegativeOne(){
        calculator.setSecondInput(0);
        calculator.setHasBattery(false);
        double result = calculator.calculateDivision();
        assertEquals(-1, result);
    }

}