package com.cognizant.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setup() {
        System.out.println("Before Test");
        calc = new Calculator();
    }

    @Test
    public void testAdd() {

        int a = 10;
        int b = 20;

        int result = calc.add(a, b);

        assertEquals(30, result);
    }

    @After
    public void tearDown() {
        System.out.println("After Test");
        calc = null;
    }
}
