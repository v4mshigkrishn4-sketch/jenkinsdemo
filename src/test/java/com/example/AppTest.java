package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testSum() {
        assertEquals(15, App.sum(5, 10));
    }
}
