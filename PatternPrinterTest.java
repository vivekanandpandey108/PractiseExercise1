import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternPrinterTest {

    PatternPrinter printer;
    @Before
    public void setUp() throws Exception {

        printer = new PatternPrinter();

    }

    @After
    public void tearDown() throws Exception {

        printer = null;

    }

    @Test
    public void printPattern() {

        assertEquals("122333", printer.printPattern(3));
        assertEquals("122333444455555", printer.printPattern(5));
    }
}