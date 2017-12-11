import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before(){
        car = new Car("Porsche", "Macan", 80000, 4, 5);
    }

    @Test
    public void canGetMake(){
        assertEquals("Porsche", car.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Macan", car.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(80000, car.getPrice());
    }

    @Test
    public void canGetWheels(){
        assertEquals(4, car.getNoOfWheels());
    }

    @Test
    public void canGetDoors(){
        assertEquals(5, car.getNoOfDoors());
    }

    @Test
    public void canIEngine() {
        assertEquals("the engine goes: Broooom", car.engineNoise("Broooom"));
    }
}
