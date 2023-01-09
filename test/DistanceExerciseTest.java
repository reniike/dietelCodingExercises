import org.junit.jupiter.api.Test;
import tdd.DistanceExercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceExerciseTest {

    @Test
    public void testThatTwoPointsInAPlaneRestOnLinePerpendicularToAxis(){
        assertTrue(DistanceExercise.isPerpendicular(2,2,4,5));
    }

    @Test
    public void testThatCoordinatesWithoutSlopeDon_tLieOnPerpendicularLine(){
        assertTrue(DistanceExercise.isPerpendicular(3,3,4,4));
    }
}
