package String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class API {

    @Test
    public void test_StringAPI() {
        String input = "abc";
        assertEquals("ABC", input.toUpperCase());
    }
}
