package org.mom47.computerscience;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Console;
import java.io.File;
import java.io.IOException;

public class CarInventoryApp {
    private final static String baseFile = "user.json";

    public static void main(String[] args) throws IOException {
        Car car = new Car();
        Console console = System.console();
        if (args.length > 0) {
            String carBrand = console.readLine("Car Brand: ");
            String carColor = console.readLine("Car Color: ");
            String releaseDate = console.readLine("Release Date: ");
            String costCar = console.readLine("Cost Car : ");
            car.setCarBrand(carBrand);
            car.setCarColor(carColor);
            car.setReleaseDate(releaseDate);
            car.setCostCar(costCar);
            toJSON(car);
            System.out.println("File name: " + args[0]);
        }
    }

    private static void toJSON(Car car) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), car);
        System.out.println("json created!");
    }
}
