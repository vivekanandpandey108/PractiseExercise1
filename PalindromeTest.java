import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;

    @Before
    public void setUp() throws Exception {
        obj = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void checkPalindrome() {

        //Assert
        assertEquals("the given number is palindrome and the sum of even numbers is less than 25",obj.checkPalindrome(12321));

        assertEquals("the given number is palindrome and the sum of even numbers is less than 25",obj.checkPalindrome(1234321));


    }
}