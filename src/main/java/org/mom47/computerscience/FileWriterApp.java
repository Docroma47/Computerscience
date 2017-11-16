package org.mom47.computerscience;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) throws IOException {
        Console console = System.console();

        if (args.length > 0) {
            File file = new File(args[0]);
            FileWriter writer = new FileWriter(file);
            if(file.createNewFile()){
                System.out.println(args[0] + "File create");
            } else {
                System.out.println(args[0] + "file not created");
            }
            System.out.println("File name: " + args[0]);
            String text = console.readLine("Please enter some text: ");
            writer.write(text);
            writer.flush();
        }
    }
}
