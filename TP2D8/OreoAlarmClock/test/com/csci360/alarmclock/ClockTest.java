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
public class ClockTest {
    
    public ClockTest() {
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
     * Test of printTotalTime method, of class Clock.
     */
    @Test
    public void testPrintTotalTime() {
        System.out.println("printTotalTime");
        Clock instance = new Clock();
        instance.printTotalTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopTimer method, of class Clock.
     */
    @Test
    public void testStopTimer() {
        System.out.println("stopTimer");
        Clock instance = new Clock();
        instance.stopTimer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clockTimeIncrementMinute method, of class Clock.
     */
    @Test
    public void testClockTimeIncrementMinute() {
        System.out.println("clockTimeIncrementMinute");
        Clock instance = new Clock();
        instance.clockTimeIncrementMinute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClockTime method, of class Clock.
     */
    @Test
    public void testGetClockTime() {
        System.out.println("getClockTime");
        Clock instance = new Clock();
        Time expResult = null;
        Time result = instance.getClockTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Clock.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Clock.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
