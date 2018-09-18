import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry obj;

    @Before
    public void setUp() throws Exception {
        obj=new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void check() {
        assertEquals("Jerry",obj.check(26));

        assertEquals("Tom",obj.check(27));

        assertEquals("Jerry",obj.check(28));

        assertEquals("Tom",obj.check(29));
    }
}
