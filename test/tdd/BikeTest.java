package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void bikeOn() {
        Bike cycle = new Bike();
        cycle.setSwitchOn(true);
        assertEquals(true, cycle.getSwitchOn());

    }

    @Test
    public void bikeOff(){
        Bike cycle = new Bike();
        cycle.setSwitchOff(true);
        assertEquals(true, cycle.getSwitchOff());
    }
    @Test
    public void bikeAccelerates(){
        Bike cycle = new Bike();
        cycle.setAccelerate(16);
        assertEquals(17, cycle.getAccelerate());
    }

    @Test
    public void bikeDecelerates(){
        Bike cycle = new Bike();
        cycle.setDecelerate(15);
        assertEquals(14, cycle.getDecelerate());

    }
}
