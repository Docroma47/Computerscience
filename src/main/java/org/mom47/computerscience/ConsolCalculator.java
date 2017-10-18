package org.mom47.computerscience;

import java.io.Console;

public class ConsolCalculator {
    public void calculte() {
        Console console = System.console();
        if(console!=null){
            // считываем данные с консоли
            String first2 = console.readLine("Please enter first number:");
            String second2 = console.readLine("Please enter second number:");
            String operation = console.readLine("Please enter operation:");
            int second = Integer.valueOf(second2);
            int first = Integer.valueOf(first2);
            int result;
            if (operation.equals("*")) {
                result = first * second;
            } else if (operation.equals("+")) {
                result = first + second;
            } else if (operation.equals("-")) {
                result = first - second;
            }else {
                result = first / second;
            }

            console.printf("Result: %s \n", result);
        }
    }
}
