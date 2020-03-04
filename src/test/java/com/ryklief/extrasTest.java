package com.ryklief;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class extrasTest {



    extras testExtra = new extras();
    Body updateBody = new Body();

    @Before
    public void setUp() throws Exception {
        testExtra.setType("Sedan");
        testExtra.setColor("white");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void engineType() {
    }

    @Test
    public void getColor() {

        assertEquals("Testing",testExtra.getColor(), "white");
    }

    @Test
    public void getType() {
        assertEquals("Testing",testExtra.getType(), "Sedan");
    }

    @Test
    public void setColor() {
    }

    @Ignore
    @Test
    public void setType() {
    }

    @Ignore
    @Test
    public void engineColor() {
        assertTrue("grey",true);
    }

    @Test
    public void testEngineType() {
        assertTrue("k20",true);
    }
}