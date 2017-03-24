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
public class AlarmTest {
    
    public AlarmTest() {
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
     * Test of enableDisableAlarmSwitch method, of class Alarm.
     */
    @Test
    public void testEnableDisableAlarmSwitch() {
        System.out.println("enableDisableAlarmSwitch");
        Alarm instance = new Alarm();
        instance.enableDisableAlarmSwitch();
        
        boolean expResult = true;
        boolean result = instance.getIsSet();
        assertEquals(expResult, result);
    }

    /**
     * Test of incrementAlarmHour method, of class Alarm.
     */
    @Test
    public void testIncrementAlarmHour() {
        System.out.println("incrementAlarmHour");
        Alarm instance = new Alarm();
        instance.incrementAlarmHour();
        
        int expResult = 1;
        int result = instance.getAlarmHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of incrementAlarmMinute method, of class Alarm.
     */
    @Test
    public void testIncrementAlarmMinute() {
        System.out.println("incrementAlarmMinute");
        Alarm instance = new Alarm();
        instance.incrementAlarmMinute();
        
        int expResult = 1;
        int result = instance.getAlarmMinute();
        assertEquals(expResult, result);
    }

    /**
     * Test of isAlarmTimeEqualToClockTime method, of class Alarm.
     */
    @Test
    public void testIsAlarmTimeEqualToClockTimeEquals() {
        System.out.println("isAlarmTimeEqualToClockTimeEquals");
        Alarm instanceAlarm = new Alarm();
        
        instanceAlarm.enableDisableAlarmSwitch();
        boolean expResult = true;
        boolean result = instanceAlarm.isAlarmTimeEqualToClockTime();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isAlarmTimeEqualToClockTime method, of class Alarm.
     */
    @Test
    public void testIsAlarmTimeEqualToClockTimeNotEquals() {
        System.out.println("isAlarmTimeEqualToClockTimeNotEquals");
        Alarm instanceAlarm = new Alarm();
        
        instanceAlarm.setHour(8);
        instanceAlarm.setMinute(0);
        instanceAlarm.setMeridien("AM");
        instanceAlarm.enableDisableAlarmSwitch();
        
        boolean expResult = false;
        boolean result = instanceAlarm.isAlarmTimeEqualToClockTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of soundAlarm method, of class Alarm.
     */
    /*@Test
    public void testSoundAlarm() {
        System.out.println("soundAlarm");
        Alarm instance = new Alarm();
        
        
        String expResult = "Playing radio at 87.5 FM frequency.";
        String result = instance.soundAlarm();
    }*/

    /**
     * Test of isAlarming method, of class Alarm.
     */
    @Test
    public void testIsAlarming() {
        System.out.println("isAlarming");
        Alarm instance = new Alarm();
        
        boolean expResult = false;
        boolean result = instance.isAlarming();
        assertEquals(expResult, result);
    }

    /**
     * Test of snooze method, of class Alarm.
     */
    /*@Test
    public void testSnooze() {
        System.out.println("snooze");
        Alarm instance = new Alarm();
        instance.snooze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
