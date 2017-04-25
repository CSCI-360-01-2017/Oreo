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
     * Test of getTotalTime method, of class Clock.
     */
    @Test
    public void testGetTotalTime() {
        System.out.println("getTotalTimeString");
        Clock instance = new Clock();
        String expResult = "4:20 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
        
    }

    
}
