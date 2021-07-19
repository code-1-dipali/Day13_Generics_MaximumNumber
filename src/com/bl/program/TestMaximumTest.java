package com.bl.program;

import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class TestMaximumTest <t> {
    TestMaximum testInt = new TestMaximum();

    @Test
    void testGetMaximumNumber() {
        t maxInt = (t) testInt.getMaximumNumber(1, 2, 3, 4, 5);
        assertEquals(5, maxInt);
    }

    @Test
    void testGetMaximumStr() {
        t maxStr = (t) testInt.getMaximumNumber("hi", "hello", "welcome", "me");
        assertEquals("welcome", maxStr);
    }

    @Test
    void testGetMaximumDouble() {
        t maxDouble = (t) testInt.getMaximumNumber(1.2, 45.9, 112.7, 12123.5);
        assertEquals( 12123.5, maxDouble);
    }

}
