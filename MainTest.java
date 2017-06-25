package com.company;

import org.junit.*;

import static com.company.Main.showPI;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Łukasz on 2017-06-25.
 */
public class MainTest {

    @Test
    public void testShow(){
        assertEquals("3,1", showPI(1));
        assertEquals("3,14", showPI(2));
        assertFalse("3,146".equals(showPI(3)));
    }
}