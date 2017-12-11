package Vehicles;

public class Motorbike extends Vehicle implements IEngine{

    public Motorbike(String make, String model, int price, int noOfWheels) {
        super(make, model, price, noOfWheels);
    }

    public String engineNoise(String sound) {
        return "the engine goes: " + sound;
    }
}
