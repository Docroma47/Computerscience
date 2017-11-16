package org.mom47.computerscience;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderApp {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            File file = new File(args[0]);
            FileReader reader = new FileReader(file);
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            reader.close();
        }
    }
}
