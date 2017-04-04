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
     * Test of plugInSystem method, of class Controller.
     */
    @Test
    public void testPlugInSystem() {
        System.out.println("plugInSystem");
        Controller instance = new Controller();
        instance.plugInSystem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unplugSystem method, of class Controller.
     */
    @Test
    public void testUnplugSystem() {
        System.out.println("unplugSystem");
        Controller instance = new Controller();
        instance.unplugSystem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
    
}
