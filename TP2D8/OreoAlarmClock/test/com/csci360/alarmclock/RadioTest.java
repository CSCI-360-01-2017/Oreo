/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriellecozart
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getVolume method, of class Radio.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Radio instance = new Radio();
        int expResult = 0;
        int result = instance.getVolume();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementVolume method, of class Radio.
     */
    @Test
    public void testIncrementVolume() {
        System.out.println("incrementVolume");
        Radio instance = new Radio();
        instance.incrementVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementVolume method, of class Radio.
     */
    @Test
    public void testDecrementVolume() {
        System.out.println("decrementVolume");
        Radio instance = new Radio();
        instance.decrementVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementFrequency method, of class Radio.
     */
    @Test
    public void testIncrementFrequency() {
        System.out.println("incrementFrequency");
        Radio instance = new Radio();
        instance.incrementFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testDecrementFrequency() {
        System.out.println("decrementFrequency");
        Radio instance = new Radio();
        instance.decrementFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeModulation method, of class Radio.
     */
    @Test
    public void testChangeModulation() {
        System.out.println("changeModulation");
        Radio instance = new Radio();
        instance.changeModulation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getisFM method, of class Radio.
     */
    @Test
    public void testGetisFM() {
        System.out.println("getisFM");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getisFM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModString method, of class Radio.
     */
    @Test
    public void testGetModString() {
        System.out.println("getModString");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getModString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playFrequency method, of class Radio.
     */
    @Test
    public void testPlayFrequency() {
        System.out.println("playFrequency");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.playFrequency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPlayFrequency method, of class Radio.
     */
    @Test
    public void testPrintPlayFrequency() {
        System.out.println("printPlayFrequency");
        Radio instance = new Radio();
        instance.printPlayFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
