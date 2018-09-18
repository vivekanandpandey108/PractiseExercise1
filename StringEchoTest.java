import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringEchoTest {

    StringEcho echoer;

    @Before
    public void setUp() throws Exception {

        echoer = new StringEcho();

    }

    @After
    public void tearDown() throws Exception {

        echoer = null;

    }


    @Test
    public void createEcho() {

        assertEquals("Stackroutetete", echoer.createEcho("Stackroute", 2));
        assertEquals("Methodthodthodthodthod", echoer.createEcho("Method", 4));
    }
}