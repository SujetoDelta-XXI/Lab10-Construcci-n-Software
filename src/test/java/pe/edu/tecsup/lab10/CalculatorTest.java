package pe.edu.tecsup.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void sub() {
        final int EXPECTED = 1;

        //process
        Calculator app = new Calculator();
        int actual = app.sub(4,3);

        //validate
        assertEquals(EXPECTED, actual);
    }

    @Test
    void add() {
        final int EXPECTED = 7;

        //process
        Calculator app = new Calculator();
        int actual = app.add(4,3);

        //validate
        assertEquals(EXPECTED, actual);
    }
}
