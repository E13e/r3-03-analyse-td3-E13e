package com.td3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {
    
    @Test
    void testHelloWorld() {
        Main main = new Main();
        assertEquals("Hello, World!", main.hello(null));
    }

    @Test
    void testHelloWithString() {
        Main main = new Main();
        assertEquals("Test", main.hello("Test"));
    }

}