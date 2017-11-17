package org.mom47.computerscience;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CarInventoryReader {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            File file = new File(args[0]);
            System.out.println("Car brand: " + toJavaObject(file).getCarBrand()
                    + "; Car color: " + toJavaObject(file).getCarColor()
                    + "; Release date: " + toJavaObject(file).getReleaseDate()
                    + "; Cost car : " + toJavaObject(file).getCostCar() + ";");
        }
    }

    public static Car toJavaObject(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, Car.class);
    }
}
