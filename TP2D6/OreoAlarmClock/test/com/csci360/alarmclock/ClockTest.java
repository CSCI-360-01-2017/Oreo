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
     * Test of timeIncrementHour method, of class Clock.
     */
    @Test
    public void testIncrementHour() {
        System.out.println("incrementHour");
        Clock instance = new Clock(1, 0, "AM");
        instance.timeIncrementHour();
        
        int expResult = 2;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of timeIncrementMinute method, of class Clock.
     */
    @Test
    public void testIncrementMinute() {
        System.out.println("incrementMinute");
        Clock instance = new Clock();
        instance.timeIncrementMinute();
        
        int expResult = 1;
        int result = instance.getMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of switchMeridien method, of class Clock.
     */
    @Test
    public void testSwitchMeridien() {
        System.out.println("switchMeridien");
        Clock instance = new Clock();
        instance.switchMeridien();
        
        String expResult = "PM";
        String result = instance.getMeridien();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of timeIncrementMinute method, of class Clock.
     */
    @Test
    public void testMinuteBoundHour() {
        System.out.println("MinuteBoundHour");
        Clock instance = new Clock(2, 59, "AM");
        instance.timeIncrementMinute();
        
        int expResult = 3;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of timeIncrementMinute method, of class Clock.
     */
    @Test
    public void testMinuteBoundMinute() {
        System.out.println("MinuteBoundMinute");
        Clock instance = new Clock(2, 59, "AM");
        instance.timeIncrementMinute();
        
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTotalTime method, of class Clock.
     */
    @Test
    public void testGetTotalTime() {
        System.out.println("getTotalTime");
        Clock instance = new Clock(4, 3, "PM");
        
        String expResult = "04:03 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of timeIncrementMinute method, of class Clock.
     */
    @Test
    public void test1159AMBound() {
        System.out.println("11:59Bound");
        Clock instance = new Clock(11, 59, "AM");
        instance.timeIncrementMinute();
        
        String expResult = "12:00 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of UserIncrementMinute method, of class Clock.
     */
    @Test
    public void testUserIncrementHour() {
        System.out.println("UserIncrementHour");
        Clock instance = new Clock(11, 54, "AM");
        instance.userIncrementHour(Clock.hour);
        
        String expResult = "12:54 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        
    }
            
     /**
     * Test of UserIncrementMinute method, of class Clock.
     */
    @Test
    public void testUserIncrementMinute() {
        System.out.println("UserIncrementMinute");
        Clock instance = new Clock(11, 59, "AM");
        instance.userIncrementMinute(Clock.minute);
        
        String expResult = "11:00 AM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of start method, of class Clock.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Clock instance = new Clock();
        instance.start();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Clock.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Clock instance = new Clock();
        instance.stop();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
