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
public class TimeTest {
    
    public TimeTest() {
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
     * Test of setHour method, of class Time.
     */
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int hour = 0;
        Time instance = new Time();
        instance.setHour(hour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinute method, of class Time.
     */
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int minute = 0;
        Time instance = new Time();
        instance.setMinute(minute);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeridien method, of class Time.
     */
    @Test
    public void testSetMeridien() {
        System.out.println("setMeridien");
        String meridien = "";
        Time instance = new Time();
        instance.setMeridien(meridien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHour method, of class Time.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinute method, of class Time.
     */
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Time instance = new Time();
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeridien method, of class Time.
     */
    @Test
    public void testGetMeridien() {
        System.out.println("getMeridien");
        Time instance = new Time();
        String expResult = "";
        String result = instance.getMeridien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeIncrementHour method, of class Time.
     */
    @Test
    public void testTimeIncrementHour() {
        System.out.println("timeIncrementHour");
        Time instance = new Time();
        instance.timeIncrementHour();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of timeIncrementMinute method, of class Time.
     */
    @Test
    public void testTimeIncrementMinute() {
        System.out.println("timeIncrementMinute");
        Time instance = new Time();
        instance.timeIncrementMinute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchMeridien method, of class Time.
     */
    @Test
    public void testSwitchMeridien() {
        System.out.println("switchMeridien");
        Time instance = new Time();
        instance.switchMeridien();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncrementHour method, of class Time.
     */
    @Test
    public void testUserIncrementHour() {
        System.out.println("userIncrementHour");
        Time instance = new Time();
        instance.userIncrementHour();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncrementMinute method, of class Time.
     */
    @Test
    public void testUserIncrementMinute() {
        System.out.println("userIncrementMinute");
        Time instance = new Time();
        instance.userIncrementMinute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Time.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        Time instance = new Time();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalTime method, of class Time.
     */
    @Test
    public void testGetTotalTime() {
        System.out.println("getTotalTime");
        Time instance = new Time();
        String expResult = "";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
