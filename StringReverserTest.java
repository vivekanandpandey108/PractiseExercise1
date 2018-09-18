import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverserTest {

    StringReverser reverser;

    @Before
    public void setUp() throws Exception {

        reverser = new StringReverser();
    }

    @After
    public void tearDown() throws Exception {

        reverser = null;

    }

    @Test
    public void reverseString() {

        assertEquals("pokemon", reverser.reverseString("nomekop"));

        assertEquals("malayalam", reverser.reverseString("malayalam"));
    }
}