package com.wh.test;

import com.wh.basic.Calculator;
import jdk.internal.jline.internal.TestAccessible;

public class CalculatorTest {

    public void testAdd(){
        Calculator c = new Calculator();
        c.add(1, 2);
    }
}
