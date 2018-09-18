import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomInputSumTest {

    RandomInputSum adder;
    @Before
    public void setUp() throws Exception {

        adder = new RandomInputSum();

    }

    @After
    public void tearDown() throws Exception {

        adder = null;

    }

    @Test
    public void findSum() {

        int[] inputArray = {1,5,7,10};
        assertEquals(23,adder.findSum(inputArray));
    }
}