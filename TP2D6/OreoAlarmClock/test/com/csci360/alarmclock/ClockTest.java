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
 * @author Brielen Beamon
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

    
    @Test
    public void testSetHour() {
        System.out.println("setHour");
        int hour = 0;
        Clock instance = new Clock();
        instance.setHour(hour);
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
    
    @Test
    public void testSetMinute() {
        System.out.println("setMinute");
        int minute = 0;
        Clock instance = new Clock();
        instance.setMinute(minute);
        // TODO review the generated test code and remove the default call to fail.
        
    }
   

    
    @Test
    public void testSetModulation() {
        System.out.println("setModulation");
        String mod = "";
        Clock instance = new Clock();
        instance.setModulation(mod);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    
    @Test
    public void testGetMinute() {
        System.out.println("getMinute");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getMinute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    
    @Test
    public void testGetMod() {
        System.out.println("getMod");
        Clock instance = new Clock();
        String expResult = "";
        String result = instance.getMod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    

    
    @Test
    public void testIncHour() {
        System.out.println("incHour");
        Clock instance = new Clock();
        instance.incHour();
        // TODO review the generated test code and remove the default call to fail.
        instance.setHour(11);
        instance.incHour();
        instance.printHour();
        instance.incHour();
        instance.printHour();
    }

    @Test
    public void testIncMinute() {
        System.out.println("incMinute");
        Clock instance = new Clock();
        instance.incMinute();
        // TODO review the generated test code and remove the default call to fail.
        instance.setMinute(60);
        instance.incMinute();
        instance.printMinute();
    }

   
    @Test
    public void testSwitchMod() {
        System.out.println("switchMod");
        Clock instance = new Clock();
        instance.switchMod();
        // TODO review the generated test code and remove the default call to fail.
        instance.printMod();
        instance.switchMod();
        instance.printHour();
        
    }

 
    @Test
    public void testPrintHour() {
        System.out.println("printHour");
        Clock instance = new Clock();
        instance.printHour();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

    
    @Test
    public void testPrintMinute() {
        System.out.println("printMinute");
        Clock instance = new Clock();
        instance.printMinute();
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
  
    
    @Test
    public void testPrintMod() {
        System.out.println("printMod");
        Clock instance = new Clock();
        instance.printMod();
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
    
}
