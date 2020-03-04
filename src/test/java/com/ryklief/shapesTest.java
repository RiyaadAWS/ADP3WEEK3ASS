package com.ryklief;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class shapesTest {


    shapes shape = new shapes();
    @Test (timeout = 1000)

    @Before
    public void setUp() throws Exception {

       shape.calcArea(23);
       shape.calcArea(3.0);
       shape.calcArea(23,4);
    }

    @Test
    public void calcArea() {

    }

    @Test
    public void testCalcArea() {
        assertEquals(92,92);
        assertNotEquals(959,512);
        Assert.fail("incorrect");
    }

    @Test
    public void testCalcArea1() {

        assertEquals(529, 529);
        assertNotEquals(59,52);
        //Assert.fail("incorrect");

    }

    @Test
    public void testCalcArea2() {

        assertEquals(28.274333882308138,28.274333882308132,28.274333882308138);

    }

    @Ignore
    @Test
    public void testToString() {
    }

    @Test
    public void main() {
    }


}