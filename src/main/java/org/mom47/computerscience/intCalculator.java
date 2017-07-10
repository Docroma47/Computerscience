package org.mom47.computerscience;

/**
 * Created by mom47 on 11/7/17.
 */
public class intCalculator {


    private int value = 268;

    public void Add (int add) {
       System.out.println(add = value += add );/*сложение*/
    }

    public void Subtract(int subtract) {
        System.out.println(subtract = value -= subtract);/*вычетание*/
    }

    public void Multiply(int multiply) {
        System.out.println(multiply = value *= multiply);/*сложение*/
    }

    public void Divide(int divide) {
        System.out.println( divide  = value /= divide);/*деление*/
    }

    public int getValue() {
        return value;
    }

}