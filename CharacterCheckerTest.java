import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckerTest {

    CharacterChecker checker;

    @Before
    public void setUp() throws Exception {

        checker = new CharacterChecker();
    }

    @After
    public void tearDown() throws Exception {

        checker = null;

    }

    @Test
    public void checkCharacter() {

        assertEquals("Capital Letter", checker.checkCharacter('T'));
        assertEquals("Small Letter", checker.checkCharacter('a'));
        assertEquals("Digit", checker.checkCharacter('3'));
        assertEquals("Special Character", checker.checkCharacter('%'));

    }
}