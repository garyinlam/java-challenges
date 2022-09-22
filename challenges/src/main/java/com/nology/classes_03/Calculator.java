package com.nology.classes_03;

/**
 * -------------- Intermediate -----------------
 *
 * The Calculator class represents a simple calculator.
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Adding a constructor
 * - Implement getters and setters
 * - Implementing methods
 *
 * Each step is documented through the class.
 *
 */

public class Calculator {

    /**
     * Create 3 private fields below:
     * - hasBattery is a boolean set to true by default
     * - firstInput is a double
     * - secondInput is a double
     */

    private boolean hasBattery = true;
    private double firstInput;
    private double secondInput;

    /**
     * Create a constructor below to initialize the class and the data to the fields above.
     * hasBattery should be set to true by default and is not needed in the constructor
     */
    public Calculator(double firstInput, double secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
    }

    /**
     * Create getters and setters for the fields above.
     *
     * They will need to be named:
     * - getHasBattery
     * - setHasBattery
     * - getFirstInput
     * - setFirstInput
     * - getSecondInput
     * - setSecondInput
     *
     * Each getter gets the corresponding private field.
     * Each setter sets the corresponding private field. It will need parameters to accept a value to then set to the
     * field.
     *
     */
    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public double getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(double secondInput) {
        this.secondInput = secondInput;
    }

    /**
     * Create a calculateAddition method below
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called calculateAddition
     *
     * The method should add the two inputs together and return the result
     *
     * If hasBattery is false it should return -1
     *
     * @return double result of firstInput + secondInput
     */

    public double calculateAddition() {
        if (hasBattery) {
            return firstInput + secondInput;
        } else {
            return -1;
        }
    }

    /**
     * Create a calculateDivision method below
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called calculateDivision
     *
     * The method should divide the first input by the second and return the result
     *
     * If hasBattery is false it should return -1
     * If the second input is 0 it should return 0
     *
     * @return double result of firstInput / secondInput
     */

    public double calculateDivision() {
        if (hasBattery) {
            if (secondInput == 0) {
                return 0;
            } else {
                return firstInput/secondInput;
            }
        } else {
            return -1;
        }
    }
}
