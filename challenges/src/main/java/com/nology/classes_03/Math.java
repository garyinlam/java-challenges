package com.nology.classes_03;

import java.math.BigDecimal;

/**
 * -------------- Advanced -----------------
 *
 * The Math class is a chance for you to implement your own version of the inbuilt Math class.
 * With additional methods.
 *
 * DO NOT USE THE INBUILT MATH CLASS
 *
 * This is a skeleton of a class you will have to complete it by following these steps.
 * - Adding data fields / properties
 * - Implement getters and setters
 * - Implementing three methods
 *
 * Each step is documented through the class.
 */


public class Math {
    /**
     * Create 1 private field below:
     * - PI is a double and should be set to 3.141592653589793 by default
     */

    private double PI = 3.141592653589793;

    /**
     * Create getters and setters for the fields above.
     *
     * They will need to be named:
     * - getPI
     * - setPI
     *
     * Each getter gets the corresponding private field.
     * Each setter sets the corresponding private field.
     *
     * setPI should make sure the incoming number is between 3.1 and 3.2
     * If it isn't it should not update the PI field
     */
    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        if (PI > 3.1 && PI < 3.2) {
            this.PI = PI;
        }
    }

    /**
     * Complete the min method
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called min
     *
     * It returns the smallest of two given numbers
     *
     *
     * @param num1 The first number to check
     * @param num2 The second number to check
     * @return double The smaller of the two numbers
     */

    public double min(double num1, double num2) {
        return java.lang.Math.min(num1, num2);
    }

    /**
     * Complete the max method
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called max
     *
     * It returns the largest of two given numbers
     *
     * @param num1 The first number to check
     * @param num2 The second number to check
     * @return double The larger of the two numbers
     */

    public double max(double num1, double num2) {
        return java.lang.Math.max(num1, num2);
    }

    /**
     * Complete the calculateCircleArea method
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called calculateCircleArea
     *
     * It takes a given radius and uses the PI field to calculate the are of the circle
     *
     * If the radius is less than or equal to 0 it shoudl return -1
     *
     * @param radius The radius of the circle
     * @return double The area of the circle
     */

    public double calculateCircleArea(double radius) {
        if (radius > 0) {
//            BigDecimal bdPI = new BigDecimal(PI);
//            BigDecimal bdRad = new BigDecimal(radius);
//            BigDecimal bd = bdPI.multiply(bdRad).multiply(bdRad);
//            return bd.doubleValue();
            return PI * (radius * radius);
        } else {
            return -1;
        }
    }

    /**
     * Complete the pow method
     *
     * This should:
     * - be a public method
     * - return a double
     * - be called pow
     *
     * It raises the first number to the power of the second number and returns the result.
     * The first number is multiplied by itself for the second number of times.
     *
     * HINT: How about a while loop?
     * https://www.w3schools.com/java/java_while_loop.asp
     *
     * @param number The first number to check
     * @param power The second number to check
     * @return double The larger of the two numbers
     */

    public double pow(double number, double power) {
        double retVal = 1;
        for (int i = 0; i < power; i++) {
            retVal = retVal * number;
        }
        //return java.lang.Math.pow(number,power);
        return retVal;
    }

}
