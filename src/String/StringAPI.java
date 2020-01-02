package String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringAPI {

    @Test
    public void test_StringAPI() {
        String input = "aBc";
//        toUpperCase()
        assertEquals("ABC", input.toUpperCase());
//        toLowerCase()
        assertEquals("abc", input.toLowerCase());

//        intern()
        String input2 = "edf";
        String input3 = "dgs";
        System.out.println(input.intern());
        System.out.println(input2.intern());

        System.out.println(input3.intern());

//        assertEquals("", input3.intern());
    }
}
