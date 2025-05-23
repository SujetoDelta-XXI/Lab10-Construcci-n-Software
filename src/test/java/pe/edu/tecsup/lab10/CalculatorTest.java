package pe.edu.tecsup.lab10;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static final Logger log = LogManager.getLogger(CalculatorTest.class);

    @BeforeAll
    static void initAll() {
        Configurator.setRootLevel(org.apache.logging.log4j.Level.INFO);
        log.info("initAll()....!");
    }

    @AfterAll
    static void finishAll() {
        log.info("finishAll()....!");
    }

    @BeforeEach
    void beforeTest() {
        log.info("beforeTest()....!");
    }

    @AfterEach
    void afterTest() {
        log.info("afterTest()....!");
    }

    @Test
    void testSub() {
        log.info("testSub()....!");
        final int EXPECTED = 1;
        // process
        Calculator app = new Calculator();
        int actual = app.sub(4, 3);
        //validate
        assertEquals(EXPECTED, actual);
    }

    @Test
    void testAdd() {
        log.info("testAdd()....!");
        final int EXPECTED = 7;
        // process
        Calculator app = new Calculator();
        int actual = app.add(4, 3);
        //validate
        assertEquals(EXPECTED, actual);
    }

    @Test
    void testMult() {
        log.info("testMult()....!");
        final int EXPECTED = 12;
        // process
        Calculator app = new Calculator();
        int actual = app.mult(4, 3);
        //validate
        assertEquals(EXPECTED, actual);
    }

    @Test
    void testDiv() {
        log.info("testDiv()....!");
        final int EXPECTED = 4/3;
        // process
        Calculator app = new Calculator();
        int actual = app.div(4, 3);
        //validate
        assertEquals(EXPECTED, actual);
    }
}



/*public class CalculatorTest {

    @Test
    void sub() {
        final int EXPECTED = 1;

        //process
        Calculator app = new Calculator();
        int actual = app.sub(4,3);

        //validate
        assertEquals(EXPECTED, actual);

        System.out.println("Prueba de resta exitosa");
    }

    @Test
    void add() {
        final int EXPECTED = 7;

        //process
        Calculator app = new Calculator();
        int actual = app.add(4,3);

        //validate
        assertEquals(EXPECTED, actual);

        System.out.println("Prueba de suma exitosa");
    }

    @Test
    void mult() {
        final int EXPECTED = 12;

        //process
        Calculator app = new Calculator();
        int actual = app.mult(4,3);

        //validate
        assertEquals(EXPECTED, actual);

        System.out.println("Prueba de multiplicación exitosa");
    }

    @Test
    void div() {
        final int EXPECTED = 4/3;

        //process
        Calculator app = new Calculator();
        int actual = app.div(4,3);

        //validate
        assertEquals(EXPECTED, actual);

        System.out.println("Prueba de división exitosa");
    }

}*/
