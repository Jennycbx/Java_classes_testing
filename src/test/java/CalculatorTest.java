import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(8, calculator.add(4, 4));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiply() {
        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(3, calculator.divide(15, 5), 0.0);
    }
}