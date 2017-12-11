package Vehicles;

public class Van extends Vehicle implements IEngine{

    int noOfDoors;

    public Van(String make, String model, int price, int noOfWheels, int noOfDoors) {
        super(make, model, price, noOfWheels);
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfDoors() {
        return this.noOfDoors;
    }

    public String engineNoise(String sound) {
        return "the engine goes: " + sound;
    }
}
