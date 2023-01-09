import chapterFour.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {

    @Test
    public void testThatCarCanBeCraeted(){
        Car benz = new Car("G-990" , "2022", 50.00);
        assertNotNull(benz);

        
    }
}
