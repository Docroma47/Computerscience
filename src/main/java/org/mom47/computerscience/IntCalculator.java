package org.mom47.computerscience;

/**
 * Calculator
 */

public class IntCalculator {
    private int value;

    IntCalculator (int value) {
    }

    public void polyfunction (int addition,int subtraction,int multiply,int division) {
        value += addition;
        value -= subtraction;
        value *= multiply;
        value /= division;
    }

    public void add (int addition) {
        value += addition ;/*сложение*/
    }

    public void subtract(int subtraction) {
        value -= subtraction;/*вычетание*/
    }

    public void multiplys(int multiply) {
         value *= multiply;/*умножение*/
    }

    public void divide(int div) {
        value /= div;/*деление*/
    }

    public int getValue() {
        return value;
    }
}
