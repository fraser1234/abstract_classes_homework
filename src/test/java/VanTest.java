import Vehicles.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VanTest {

    Van van;

    @Before
    public void before(){
        van = new Van("LDV", "Mini bus", 5000, 4, 2);
    }

    @Test
    public void canGetMake(){
        assertEquals("LDV", van.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("Mini bus", van.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(5000, van.getPrice());
    }

    @Test
    public void canGetWheels(){
        assertEquals(4, van.getNoOfWheels());
    }

    @Test
    public void canGetDoors(){
        assertEquals(2, van.getNoOfDoors());
    }

    @Test
    public void canIEngine() {
        assertEquals("the engine goes: broken down", van.engineNoise("broken down"));
    }

}
