import Vehicles.Motorbike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotorbikeTest {

        Motorbike motorbike;

        @Before
        public void before(){
            motorbike = new Motorbike("Harley", "Davidson", 500, 2);
        }

        @Test
        public void canGetMake(){
            assertEquals("Harley", motorbike.getMake());
        }

        @Test
        public void canGetModel(){
            assertEquals("Davidson", motorbike.getModel());
        }

        @Test
        public void canGetPrice(){
            assertEquals(500, motorbike.getPrice());
        }

        @Test
        public void canGetWheels(){
            assertEquals(2, motorbike.getNoOfWheels());
        }

    @Test
    public void canIEngine() {
        assertEquals("the engine goes: BANG BANG", motorbike.engineNoise("BANG BANG"));
    }

}
