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
 * @author donovanroseau
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
     * Test of setAlarm method, of class Alarm.
     */
    @Test
    public void testSetAlarm() {
        System.out.println("setAlarm");
        int hour = 0;
        int min = 0;
        String alarmMod = "";
        Alarm instance = new Alarm();
        instance.setAlarm(hour, min, alarmMod);
        if (instance.getHour() == hour && instance.getMin() == min &&
                instance.getAlarmMod().equalsIgnoreCase(alarmMod))
        {
            System.out.println("Pass\n");
        }
        else
        {
            System.out.println("Fail\n");
        }
        // TODO review the generated test code and remove the default call to fail
    }
    
    /*
    * Test of setAlarm method
    */
    @Test
    public void testSetAlarm2() {
        System.out.println("setAlarm2");
        int hour = 100;
        int min = 100;
        String alarmMod = "PM";
        Alarm instance = new Alarm();
        instance.setAlarm(hour, min, alarmMod);
        if (instance.getHour() == hour && instance.getMin() == min &&
                instance.getAlarmMod().equalsIgnoreCase(alarmMod))
        {
            
            System.out.println("Pass\n");
        }
        else
        {
            System.out.println("Fail\n");
        }
        // TODO review the generated test code and remove the default call to fail
    }

    /**
     * Test of turnOff method, of class Alarm.
     */
    @Test
    public void testTurnOff() {
        System.out.println("turnOff");
        boolean isOn = true;
        Alarm instance = new Alarm();
        instance.turnOff();
        // TODO review the generated test code and remove the default call to fail.
        if (instance.isOn == false)
        {
            System.out.println("Pass\n");
        }
        else
        {
            System.out.println("Fail\n");
        }
    }
    
    /**
     * Test of turnOff method, of class Alarm.
     */
    @Test
    public void testTurnOff2()
    {
        System.out.println("turnOffTest2");
        boolean isOn= false;
        Alarm instance = new Alarm();
        instance.turnOff();
        // TODO review the generated test code and remove the default call to fail.
        if (instance.isOn == false)
        {
            System.out.println("Pass\n");
        }
        else
        {
            System.out.println("Fail\n");
        }
    } 
}
