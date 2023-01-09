package tdd;
import me.ClockClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockClassTest {

    @Test
    public void testToCreateClock(){
        ClockClass clock = new ClockClass(0,0, 0 );
        assertNotNull(0, clock.toString());

    }
}
