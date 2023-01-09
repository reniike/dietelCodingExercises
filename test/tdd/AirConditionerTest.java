package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void acOn() {
        AirConditioner Ac = new AirConditioner();
        Ac.setSwitchOn(true);
        assertEquals (true, Ac.getSwitchOn());
    }

    @Test
     public void acOff(){
        AirConditioner Ac = new AirConditioner();
        Ac.setSwitchOff(true);
        assertEquals(true, Ac.getSwitchOff());
    }

    @Test
    public void acIncreases(){
        AirConditioner Ac = new AirConditioner();
            Ac.setSwitchOn(true);
            assertEquals(true, Ac.getSwitchOn());
        Ac.setIncreaseTemperature(20);
        assertEquals(19,Ac.getIncreaseTemperature());
    }

    @Test
    public void acDecreases(){
        AirConditioner Ac = new AirConditioner();
        Ac.setSwitchOn(true);
        assertEquals(true , Ac.getSwitchOn());
        Ac.setDecreaseTemperature(16);
        assertEquals (17, Ac.getDecreaseTemperature());
    }

   @Test
    public void maximumIncrease(){
        AirConditioner Ac = new AirConditioner();
        Ac.setSwitchOn(true);
        Ac.setTemperature(15);
        assertEquals(16, Ac.getTemperature());
    }

    @Test
    public void maximumDecrease(){
        AirConditioner Ac = new AirConditioner();
        Ac.setSwitchOn(true);
        Ac.setTemperature(31);
        assertEquals(30,Ac.getTemperature());

    }



}
