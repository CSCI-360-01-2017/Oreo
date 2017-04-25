/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.io.File;
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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of checkAlarm method, of class Controller.
     */
    @Test
    public void testCheckAlarm() {
        System.out.println("checkAlarm");
        Controller instance = new Controller();
        instance.checkAlarm();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClock method, of class Controller.
     */
    @Test
    public void testGetClock() {
        System.out.println("getClock");
        Controller instance = new Controller();
        Clock expResult = null;
        Clock result = instance.getClock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncrementHour method, of class Controller.
     */
    @Test
    public void testUserIncrementHour() {
        System.out.println("userIncrementHour");
        Controller instance = new Controller();
        instance.userIncrementHour();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncrementMinute method, of class Controller.
     */
    @Test
    public void testUserIncrementMinute() {
        System.out.println("userIncrementMinute");
        Controller instance = new Controller();
        instance.userIncrementMinute();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm1Time method, of class Controller.
     */
    @Test
    public void testGetAlarm1Time() {
        System.out.println("getAlarm1Time");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.getAlarm1Time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm2Time method, of class Controller.
     */
    @Test
    public void testGetAlarm2Time() {
        System.out.println("getAlarm2Time");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.getAlarm2Time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleSetTime method, of class Controller.
     */
    @Test
    public void testToggleSetTime() {
        System.out.println("toggleSetTime");
        Controller instance = new Controller();
        instance.toggleSetTime();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleSetAlarm1 method, of class Controller.
     */
    @Test
    public void testToggleSetAlarm1() {
        System.out.println("toggleSetAlarm1");
        Controller instance = new Controller();
        instance.toggleSetAlarm1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleSetAlarm2 method, of class Controller.
     */
    @Test
    public void testToggleSetAlarm2() {
        System.out.println("toggleSetAlarm2");
        Controller instance = new Controller();
        instance.toggleSetAlarm2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm1ToggleBoolean method, of class Controller.
     */
    @Test
    public void testGetAlarm1ToggleBoolean() {
        System.out.println("getAlarm1ToggleBoolean");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getAlarm1ToggleBoolean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm2ToggleBoolean method, of class Controller.
     */
    @Test
    public void testGetAlarm2ToggleBoolean() {
        System.out.println("getAlarm2ToggleBoolean");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getAlarm2ToggleBoolean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleAlarm1EnabledBoolean method, of class Controller.
     */
    @Test
    public void testToggleAlarm1EnabledBoolean() {
        System.out.println("toggleAlarm1EnabledBoolean");
        Controller instance = new Controller();
        instance.toggleAlarm1EnabledBoolean();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toggleAlarm2EnabledBoolean method, of class Controller.
     */
    @Test
    public void testToggleAlarm2EnabledBoolean() {
        System.out.println("toggleAlarm2EnabledBoolean");
        Controller instance = new Controller();
        instance.toggleAlarm2EnabledBoolean();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm1EnabledBoolean method, of class Controller.
     */
    @Test
    public void testGetAlarm1EnabledBoolean() {
        System.out.println("getAlarm1EnabledBoolean");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getAlarm1EnabledBoolean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm2EnabledBoolean method, of class Controller.
     */
    @Test
    public void testGetAlarm2EnabledBoolean() {
        System.out.println("getAlarm2EnabledBoolean");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.getAlarm2EnabledBoolean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class Controller.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Controller instance = new Controller();
        Time expResult = null;
        Time result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlarmSounding method, of class Controller.
     */
    @Test
    public void testIsAlarmSounding() {
        System.out.println("isAlarmSounding");
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.isAlarmSounding();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarmSounding1 method, of class Controller.
     */
    @Test
    public void testSetAlarmSounding1() {
        System.out.println("setAlarmSounding1");
        Controller instance = new Controller();
        instance.setAlarmSounding1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarmSounding2 method, of class Controller.
     */
    @Test
    public void testSetAlarmSounding2() {
        System.out.println("setAlarmSounding2");
        Controller instance = new Controller();
        instance.setAlarmSounding2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarmSounding method, of class Controller.
     */
    @Test
    public void testSetAlarmSounding() {
        System.out.println("setAlarmSounding");
        Controller instance = new Controller();
        instance.setAlarmSounding();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alarm1Snooze method, of class Controller.
     */
    @Test
    public void testAlarm1Snooze() {
        System.out.println("alarm1Snooze");
        Controller instance = new Controller();
        instance.alarm1Snooze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alarm2Snooze method, of class Controller.
     */
    @Test
    public void testAlarm2Snooze() {
        System.out.println("alarm2Snooze");
        Controller instance = new Controller();
        instance.alarm2Snooze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolumeString method, of class Controller.
     */
    @Test
    public void testGetVolumeString() {
        System.out.println("getVolumeString");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.getVolumeString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userGetFrequencyString method, of class Controller.
     */
    @Test
    public void testUserGetFrequencyString() {
        System.out.println("userGetFrequencyString");
        Controller instance = new Controller();
        String expResult = "";
        String result = instance.userGetFrequencyString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userToggleIsFM method, of class Controller.
     */
    @Test
    public void testUserToggleIsFM() {
        System.out.println("userToggleIsFM");
        Controller instance = new Controller();
        instance.userToggleIsFM();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncremenetFrequency method, of class Controller.
     */
    @Test
    public void testUserIncremenetFrequency() {
        System.out.println("userIncremenetFrequency");
        Controller instance = new Controller();
        instance.userIncremenetFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userDecrementFrequency method, of class Controller.
     */
    @Test
    public void testUserDecrementFrequency() {
        System.out.println("userDecrementFrequency");
        Controller instance = new Controller();
        instance.userDecrementFrequency();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userIncremenetVolume method, of class Controller.
     */
    @Test
    public void testUserIncremenetVolume() {
        System.out.println("userIncremenetVolume");
        Controller instance = new Controller();
        instance.userIncremenetVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userDecrementVolume method, of class Controller.
     */
    @Test
    public void testUserDecrementVolume() {
        System.out.println("userDecrementVolume");
        Controller instance = new Controller();
        instance.userDecrementVolume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of userSnooze method, of class Controller.
     */
    @Test
    public void testUserSnooze() {
        System.out.println("userSnooze");
        Controller instance = new Controller();
        instance.userSnooze();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playRadio method, of class Controller.
     */
    @Test
    public void testPlayRadio() {
        System.out.println("playRadio");
        Controller instance = new Controller();
        instance.playRadio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeDecibel method, of class Controller.
     */
    @Test
    public void testChangeDecibel() {
        System.out.println("changeDecibel");
        Controller instance = new Controller();
        instance.changeDecibel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMasterVolume method, of class Controller.
     */
    @Test
    public void testSetMasterVolume() {
        System.out.println("setMasterVolume");
        float value = 0.0F;
        Controller instance = new Controller();
        instance.setMasterVolume(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class Controller.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        File sound = null;
        Controller instance = new Controller();
        instance.play(sound);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopRadio method, of class Controller.
     */
    @Test
    public void testStopRadio() {
        System.out.println("stopRadio");
        Controller instance = new Controller();
        instance.stopRadio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startAlarmSound method, of class Controller.
     */
    @Test
    public void testStartAlarmSound() {
        System.out.println("startAlarmSound");
        File sound = null;
        Controller instance = new Controller();
        instance.startAlarmSound(sound);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopAlarmSound method, of class Controller.
     */
    @Test
    public void testStopAlarmSound() {
        System.out.println("stopAlarmSound");
        Controller instance = new Controller();
        instance.stopAlarmSound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Controller.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Controller expResult = null;
        Controller result = Controller.start();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
