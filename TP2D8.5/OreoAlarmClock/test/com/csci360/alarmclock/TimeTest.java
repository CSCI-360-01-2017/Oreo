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
     * Test of timeIncrementHour method, of class Time.
     */
    @Test
    public void testTimeIncrementHour() {
        System.out.println("timeIncrementHour");
        Time instance = new Time();
        instance.setHour(3);
        instance.timeIncrementHour();
        int expResult = 4;
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
        instance.setMinute(12);
        instance.timeIncrementMinute();
        int expResult = 13;
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
        instance.setMeridien(Constants.AM_MERIDIEN);
        instance.switchMeridien();
        String expResult = Constants.PM_MERIDIEN;
        String result = instance.getMeridien();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of userIncrementHour method, of class Time.
     */
    @Test
    public void testUserIncrementMinuteBound() {
        System.out.println("userIncrementMinuteBound");
        Time instance = new Time();
        instance.setHour(11);
        instance.setMinute(59);
        instance.userIncrementMinute();
        int expResult = 0;
        int result = instance.getMinute();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of userIncrementMinute method, of class Time.
     */
    @Test
    public void testUserIncrementHourBound() {
        System.out.println("userIncrementHourBound");
        Time instance = new Time();
        instance.setHour(11);
        instance.setMinute(59);
        instance.userIncrementMinute();
        int expResult = 11;
        int result = instance.getHour();
        
        assertEquals(expResult, result);
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
    }
    
}
