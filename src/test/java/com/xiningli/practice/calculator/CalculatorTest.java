package com.xiningli.practice.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void addTest(){
        assertEquals(Calculator.add(1,2),3);

    }
}

