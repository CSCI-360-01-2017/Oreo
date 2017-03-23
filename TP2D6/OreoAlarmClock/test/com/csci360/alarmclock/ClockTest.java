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
     * Test of incrementHour method, of class Clock.
     */
    @Test
    public void testIncrementHour() {
        System.out.println("incrementHour");
        Clock instance = new Clock(1, 0, "AM");
        instance.incrementHour();
        
        int expResult = 2;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testIncrementMinute() {
        System.out.println("incrementMinute");
        Clock instance = new Clock();
        instance.incrementMinute();
        
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
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testMinuteBoundHour() {
        System.out.println("MinuteBoundHour");
        Clock instance = new Clock(2, 59, "AM");
        instance.incrementMinute();
        
        int expResult = 3;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void testMinuteBoundMinute() {
        System.out.println("MinuteBoundMinute");
        Clock instance = new Clock(2, 59, "AM");
        instance.incrementMinute();
        
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
     * Test of incrementMinute method, of class Clock.
     */
    @Test
    public void test1159AMBound() {
        System.out.println("11:59Bound");
        Clock instance = new Clock(11, 59, "AM");
        instance.incrementMinute();
        
        String expResult = "12:00 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
    }
    
}
