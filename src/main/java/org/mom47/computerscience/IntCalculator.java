package org.mom47.computerscience;

/**
 * Calculator
 */

public class IntCalculator {
    private int value ;

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
