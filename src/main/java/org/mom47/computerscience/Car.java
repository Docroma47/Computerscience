package org.mom47.computerscience;

public class Car {
    private String carBrand;
    private String carColor;
    private String releaseDate;
    private String costCar;

    public Car() {
    }

    public Car(String carBrand, String carColor, String releaseDate, String costCar) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.releaseDate = releaseDate;
        this.costCar = costCar;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getCostCar() {
        return costCar;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCostCar(String costCar) {
        this.costCar = costCar;
    }

    @Override
    public String toString() {
        return "Car brand:" + carBrand + ", Car color: " + carColor + ", Release date: " + releaseDate
                + ", Cost car: " + costCar + "]";
    }
}
