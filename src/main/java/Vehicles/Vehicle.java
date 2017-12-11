package Vehicles;

public abstract class Vehicle {

    private String make;
    private String model;
    private int price;
    private int noOfWheels;

    public Vehicle(String make, String model, int price, int noOfWheels) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.noOfWheels = noOfWheels;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public int getNoOfWheels() {
        return this.noOfWheels;
    }
}
