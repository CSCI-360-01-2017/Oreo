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
 * @author cozartge
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
     * Test of timeIncrementHour method, of class Time.
     */
    @Test
    public void testTimeIncrementHour() {
        System.out.println("timeIncrementHour");
        Time instance = new Time();
        instance.timeIncrementHour();
        
        instance.timeIncrementHour();
        
        int expResult = 2;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of timeIncrementMinute method, of class Time.
     */
    @Test
    public void testTimeIncrementMinute() {
        System.out.println("timeIncrementMinute");
        Time instance = new Time();
        instance.timeIncrementMinute();
        
        int expResult = 1;
        int result = instance.getMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of switchMeridien method, of class Time.
     */
    @Test
    public void testSwitchMeridien() {
        System.out.println("switchMeridien");
        Time instance = new Time();
        instance.switchMeridien();

        String expResult = Constants.PM_MERIDIEN;
        String result = instance.getMeridien();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of timeIncrementMinute method, of class Time.
     */
    @Test
    public void testMinuteBoundHour() {
        System.out.println("MinuteBoundHour");
        Time instance = new Time(2, 59, "AM");
        instance.timeIncrementMinute();
        
        int expResult = 3;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of timeIncrementMinute method, of class Time.
     */
    @Test
    public void testMinuteBoundMinute() {
        System.out.println("MinuteBoundMinute");
        Time instance = new Time(2, 59, "AM");
        instance.timeIncrementMinute();
        
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of timeIncrementMinute method, of class Time.
     */
    @Test
    public void test1159AMBound() {
        System.out.println("11:59Bound");
        Time instance = new Time(11, 59, "AM");
        instance.timeIncrementMinute();
        
        String expResult = "12:00 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of UserIncrementMinute method, of class Time.
     */
    @Test
    public void testUserIncrementHour() {
        System.out.println("UserIncrementHour");
        Time instance = new Time(11, 54, "AM");
        instance.userIncrementHour();
        
        String expResult = "12:54 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        
    }
    
     /**
     * Test of UserIncrementMinute method, of class Time.
     */
    @Test
    public void testUserIncrementMinute() {
        System.out.println("UserIncrementMinute");
        Time instance = new Time(11, 59, "AM");
        instance.userIncrementMinute();
        
        String expResult = "11:00 AM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTotalTime method, of class Time.
     */
    @Test
    public void testGetTotalTime() {
        System.out.println("getTotalTime");
        Time instance = new Time(4, 3, "PM");
        
        String expResult = "04:03 PM";
        String result = instance.getTotalTime();
        assertEquals(expResult, result);
    }    
}
