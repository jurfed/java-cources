import org.junit.jupiter.api.Test;
import ru.lesson.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calc = new Calculator();
        calc.add(1, 2, 3);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void minus() {
        Calculator calc = new Calculator();
        calc.minus(3, 1);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void mult() {
        Calculator calc = new Calculator();
        calc.mult(2, 3);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        calc.div(9, 3);
        assertEquals(3, calc.getResult());
    }

    @Test
    public void power() {
        Calculator calc = new Calculator();
        calc.power(2, 3);
        assertEquals(8, calc.getResult());
    }

}
