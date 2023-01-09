import me.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {

    @Test
    public void testThatCalculatorExists(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }
    @Test
    public void testForAddition(){
        Calculator calculator = new Calculator();
        int firstNumber = 4;
        int secondNumber = 5;
        int sum = calculator.addNumber(firstNumber, secondNumber);
        assertEquals(9,sum);
    }
}


