package TestPipelineProject.TestPipelineProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSomar() {
        assertEquals(5, calculator.somar(2, 3));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calculator.subtrair(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculator.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculator.dividir(6, 3));
    }
}
