package simpleapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    public void evenNumber() {
        String someData = new Example().getSomeData(2);
        assertEquals(someData, "even");
    }

}