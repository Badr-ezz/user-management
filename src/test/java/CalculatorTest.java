import com.hendisantika.usermanagement.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // =====================
    // Cas normaux
    // =====================

    @Test
    void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    void testDivision() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    // =====================
    // Cas limites
    // =====================

    @Test
    void testAdditionWithZero() {
        int result = calculator.add(0, 5);
        assertEquals(5, result);
    }

    @Test
    void testMultiplicationWithZero() {
        int result = calculator.multiply(7, 0);
        assertEquals(0, result);
    }

    @Test
    void testDivisionResultZero() {
        int result = calculator.divide(0, 5);
        assertEquals(0, result);
    }

    // =====================
    // Exceptions
    // =====================

    @Test
    void testDivisionByZeroThrowsException() {
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Division by zero", exception.getMessage());
    }
}
