import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSumCheckerTest {

    SortedSumChecker checker;


    @Before
    public void setUp() throws Exception {

        checker = new SortedSumChecker();
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void sortNum() {

        assertEquals(123455, checker.sortNum(543215));
    }

    @Test
    public void checkSum() {

        assertFalse(checker.checkSum(543215));

    }

    @Test
    public void isEven() {

        assertFalse(checker.isEven(543215));

    }
}