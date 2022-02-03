package simpleapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {

    @Test
    public void test() {
        assertEquals(new Example().getData(), 42);
    }
}