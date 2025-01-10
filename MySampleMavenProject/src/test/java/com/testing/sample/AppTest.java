package com.testing.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSum() {
        int a = 5;
        int b = 5;
        int expSum = 10;
        int actualSum = App.sum(a, b);
        assertEquals(expSum, actualSum);
    }
}
