package academy.learning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() throws Exception {
//        Utilities util = new Utilities();
        char[] test = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, test);
        char[] test2 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, test2);
    }

    @Parameterized.Parameters
    public void removePairs() throws Exception {
//        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void converter() throws Exception {
//        Utilities util = new Utilities();
        assertEquals(300,util.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
//        Utilities util = new Utilities();
        assertEquals(300,util.converter(10,0));
    }

    @Test
    public void nullIfOddLength() throws Exception {
//        Utilities util = new Utilities();
        assertNotNull(util.nullIfOddLength("Test"));
        assertNull(util.nullIfOddLength("Test "));
    }
}