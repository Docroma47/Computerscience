package org.mom47.computerscience;


import java.io.Console;

public class FileWriterApp {
    public static void main(String[] args) {
        Console console = System.console();
        if (args.length > 0) {
            System.out.println("File name: " + args[0]);
            String text = console.readLine("Please enter some text: ");
        }
    }
}
