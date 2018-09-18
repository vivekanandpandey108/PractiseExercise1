import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void vowelConsonentCheck() {


        //Actual
        String str = "yahoo";

        //Act
        VowelConsonent obj = new VowelConsonent();

        //Assert
        assertEquals("Consonent Vowel Consonent Vowel Vowel",obj.VowelConsonentCheck(str));
    }

}