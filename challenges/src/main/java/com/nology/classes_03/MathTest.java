package com.nology.classes_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    public Math math;

    @BeforeEach
    void setUp() {
        this.math = new Math();
    }

    // Testing fields, getters and setters
    // Uncomment the tests below when you have completed the getters

    @Test
    void getPI_ValidFields_ReturnsCorrectNumber() {
        double result = math.getPI();
        assertEquals(3.141592653589793, result);
    }

    @Test
    void setPI_ValidInput_UpdatesPIField(){
        math.setPI(3.14);
        double result = math.getPI();
        assertEquals(3.14, result);
    }

    @Test
    void setPI_InvalidInputs_DoesNotUpdatePIField(){
        math.setPI(3.2);
        double overRange = math.getPI();
        assertEquals(3.141592653589793, overRange);

        math.setPI(3);
        double underRange = math.getPI();
        assertEquals(3.141592653589793, underRange);
    }

    // Testing min
    // Uncomment the tests below when you have completed the min method


    @Test
    void min_ValidInputs_ReturnsFirstNumber() {
        double result = math.min(2, 5);
        assertEquals(2, result);
    }

    @Test
    void min_ValidInputs_ReturnsSecondNumber() {
        double result = math.min(17, 5);
        assertEquals(5, result);
    }

    @Test
    void min_ValidInputs_ReturnsEqual() {
        double result = math.min(17, 17);
        assertEquals(17, result);
    }

    // Testing max
    // Uncomment the tests below when you have completed the max method

    @Test
    void max_ValidInputs_ReturnsFirstNumber() {
        double result = math.max(2, 5);
        assertEquals(5, result);
    }

    @Test
    void max_ValidInputs_ReturnsSecondNumber() {
        double result = math.max(17, 5);
        assertEquals(17, result);
    }

    @Test
    void max_ValidInputs_ReturnsEqual() {
        double result = math.max(17, 17);
        assertEquals(17, result);
    }

    // Testing calculateCircleArea
    // Uncomment the tests below when you have completed the calculateCircleArea method

    @Test
    void calculateCircleArea_ValidInputs_ReturnsArea(){
        double result = math.calculateCircleArea(45);
        assertEquals(6361.725123519331, result);
    }

    @Test
    void calculateCircleArea_ValidInputsUpdatedField_ReturnsArea(){
        math.setPI(3.14);
        double result = math.calculateCircleArea(45);
        assertEquals(6358.5, result);
    }

    @Test
    void calculateCircleArea_InvalidInputs_ReturnsNegativeOne(){
        double result = math.calculateCircleArea(0);
        assertEquals(-1, result);
    }

    // Testing pow
    // Uncomment the tests below when you have completed the pow method

    @Test
    void pow_ValidInputs_ReturnsCorrectNumber() {
        double result = math.pow(2, 5);
        assertEquals(32.0, result);
    }

}