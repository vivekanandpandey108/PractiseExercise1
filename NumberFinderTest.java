import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberFinderTest {

    NumberFinder finder;
    @Before
    public void setUp() throws Exception {

        finder = new NumberFinder();

    }

    @After
    public void tearDown() throws Exception {

        finder = null;

    }

    @Test
    public void findNumber() {

        assertEquals("Number guessed is more than original number", finder.findNumber(10,5));
        assertEquals("Number guessed is less than original number", finder.findNumber(10,11));
        assertEquals("Number guessed matches the original number", finder.findNumber(10,10));
    }
}