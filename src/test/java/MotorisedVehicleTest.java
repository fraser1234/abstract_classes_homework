import VehicleStuff.MotorisedVehicle;
import Vehicles.Car;
import Vehicles.Motorbike;
import Vehicles.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorisedVehicleTest {
    MotorisedVehicle motorisedVehicle;
    Van van;
    Car car;
    Motorbike motorbike;

    @Before
    public void before(){
        motorisedVehicle = new MotorisedVehicle(car, van, motorbike, "Fraser");
        van = new Van("LDV", "Mini bus", 5000, 4, 2);
        car = new Car("Porsche", "Macan", 80000, 4, 5);
        motorbike = new Motorbike("Harley", "Davidson", 500, 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Fraser", motorisedVehicle.getName());
    }

    @Test
    public void canSpeedUp(){
        motorisedVehicle.speedUp();
        assertEquals(1, motorisedVehicle.getCurrentSpeed());
    }

    @Test
    public void cannotSpeedUpBeyondMax() {
        for (int i = 0; i < 155; i++) {
            motorisedVehicle.speedUp();
        }
        assertEquals(motorisedVehicle.getMaxSpeed(), motorisedVehicle.getCurrentSpeed());
    }

    @Test
    public void cannotTurnSoundDownBelowZero() {
        motorisedVehicle.speedUp();
        motorisedVehicle.speedUp();
        for (int i = 0; i < 20; i++) {
            motorisedVehicle.speedDown();
        }
        assertEquals(0, motorisedVehicle.getCurrentSpeed());
    }
}
