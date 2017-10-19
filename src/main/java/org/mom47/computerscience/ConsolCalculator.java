package org.mom47.computerscience;

import java.io.Console;
import java.io.IOException;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;


public class ConsolCalculator {
    public static void main(String[] args) throws IOException {
        Console console = System.console();

        Terminal terminal = TerminalBuilder.terminal();
        LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();


        if (console != null) {
            String first2 = reader.readLine("Please enter second number: ");
            String second2 = reader.readLine("Please enter second number: ");
            String operation = reader.readLine("Please enter operation: ");
            int second = Integer.valueOf(second2);
            int first = Integer.valueOf(first2);
            int result;
            if (operation.equals("*")) {
                result = first * second;
            } else if (operation.equals("+")) {
                result = first + second;
            } else if (operation.equals("-")) {
                result = first - second;
            } else {
                result = first / second;
            }

            console.printf("Result: %s \n", result);
        }
    }
}
