package VehicleStuff;

import Vehicles.Car;
import Vehicles.Motorbike;
import Vehicles.Van;

public class MotorisedVehicle {

    private Car car;
    private Van van;
    private Motorbike motorbike;
    private String name;
    private int currentSpeed;
    private int maxSpeed;

    public MotorisedVehicle(Car car, Van van, Motorbike motorbike, String name) {
        this.car = car;
        this.van = van;
        this.motorbike = motorbike;
        this.name = name;
        this.currentSpeed = 0;
        this.maxSpeed = 155;
    }

    public String getName() {
        return this.name;
    }

    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void speedUp() {
        if (this.currentSpeed < maxSpeed) {
            this.currentSpeed++;
        }
    }

    public void speedDown() {
        if (this.currentSpeed > 0) {
            this.currentSpeed--;
        }
    }
}
