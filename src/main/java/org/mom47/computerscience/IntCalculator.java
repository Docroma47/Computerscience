package org.mom47.computerscience;

/**
 * Calculator
 */

public class IntCalculator {
    private int value;

    IntCalculator(int value) {
        this.value = value;/*Конструктор не использовал переменную value так как она (private).Поэтому была ошибка.*/
    }

    public void polyfunction(int addition, int subtraction, int multiply, int division) {
        value += addition;
        value -= subtraction;
        value *= multiply;
        value /= division;
    }

    public void add(int addition) {
        value += addition;/*сложение*/
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
class ConsoleToolkit {
    public static void print(String text, int x, int y, String colur) {
        char escCode = 0x1B;
        int row = x;
        int column = y;
        System.out.print(String.format("%c[%d;%df", escCode, row, column) + colur + text);
    }
}
