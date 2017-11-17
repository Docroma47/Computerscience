package org.mom47.computerscience;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CarInventoryReader {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            File file = new File(args[0]);
            System.out.println("Car brand: " + toJavaObject(file).getCarBrand());
            System.out.println("Car color: " + toJavaObject(file).getCarColor());
            System.out.println("Release date: " + toJavaObject(file).getReleaseDate());
            System.out.println("Cost car : " + toJavaObject(file).getCostCar());
        }
    }

    public static Car toJavaObject(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(file, Car.class);
    }
}
