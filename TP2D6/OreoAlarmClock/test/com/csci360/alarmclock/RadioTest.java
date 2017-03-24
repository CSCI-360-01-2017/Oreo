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
public class RadioTest {
    
    public RadioTest() {
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
     * Test of incrementVolume method, of class Radio.
     */
    @Test
    public void testIncrementVolume() {
        
        System.out.println("incrementVolume");
        
        Radio instance = new Radio();
        instance.incrementVolume();
        int expResult = 6;
        int result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of decrementVolume method, of class Radio.
     */
    @Test
    public void testDecrementVolume() {
        
        System.out.println("decrementVolume");
        Radio instance = new Radio();
        instance.decrementVolume();
        int expResult = 4;
        int result = instance.getVolume();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetFMFrequency() {
        
        System.out.println("getFMFrequency");
        Radio instance = new Radio();
        double expResult = 87.5;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        
    }
    

    /**
     * Test of incrementFrequency method, of class Radio.
     */
    @Test
    public void testIncrementFMFrequency() {
        System.out.println("incrementFMFrequency");
        Radio instance = new Radio();
        instance.incrementFrequency();
        double expResult = 87.7;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of incrementFrequency method, of class Radio.
     */
    @Test
    public void testIncrementMaxFMFrequency() {
        
        System.out.println("incrementMaxFMFrequency");
        Radio instance = new Radio(Constants.MAX_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        instance.changeModulation();
        double expResult = 1610.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        
    }
    
        
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testDecrementFMFrequency() {
        
        System.out.println("decrementFMFrequency");
        Radio instance = new Radio(100.1, 654.0);
        instance.decrementFrequency();
        double expResult = 99.9;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
    
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testDecrementMinFMFrequency() {
        
        System.out.println("decrementMinFMFrequency");
        Radio instance = new Radio(Constants.MIN_FM_FREQUENCY, Constants.MIN_AM_FREQUENCY);
        instance.decrementFrequency();
        double expResult = 87.5;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testMaxBoundCrazyFMFrequency() { 
        
        System.out.println("MaxBoundFMFrequency");
        Radio instance = new Radio(Constants.MAX_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        
        instance.decrementFrequency();
        for(int i = 0; i < 2; i ++)
            instance.incrementFrequency();
        for(int i = 0; i < 8; i++)
            instance.decrementFrequency();
        for(int i = 0; i < 2; i++)
            instance.incrementFrequency();
        instance.decrementFrequency();
        
        double expResult = 106.7;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testMinBoundCrazyFMFrequency() {
        
        System.out.println("MinBoundCrazyFMFrequency");
        Radio instance = new Radio(Constants.MIN_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        
        instance.incrementFrequency();
        for(int i = 0; i < 2; i ++)
            instance.decrementFrequency();
        for(int i = 0; i < 8; i++)
            instance.incrementFrequency();
        for(int i = 0; i < 2; i++)
            instance.decrementFrequency();
        instance.incrementFrequency();
        
        double expResult = 88.9;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
     /**
     * Test of getFrequency method, of class Radio.
     */
    @Test
    public void testGetAMFrequency() {
        
        System.out.println("getAMFrequency");
        Radio instance = new Radio();
        instance.changeModulation(); 
        double expResult = 520.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
      
    }
    
    /**
     * Test of incrementFrequency method, of class Radio.
     */
    @Test
    public void testIncrementAMFrequency() {
        System.out.println("incrementAMFrequency");
        Radio instance = new Radio();
        instance.changeModulation();
        instance.incrementFrequency();
        double expResult = 521.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of incrementFrequency method, of class Radio.
     */
    @Test
    public void testIncrementMaxAMFrequency() {
        
        System.out.println("incrementMaxAMFrequency");
        Radio instance = new Radio(Constants.MAX_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        instance.changeModulation();
        double expResult = 1610.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        
    }
    
       /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testDecrementAMFrequency() {
        
        System.out.println("decrementAMFrequency");
        Radio instance = new Radio(100.1, 654.0);
        instance.changeModulation();
        instance.decrementFrequency();
        double expResult = 653.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        
    }
    
     /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testDecrementMinAMFrequency() {
        
        System.out.println("decrementMinAMFrequency");
        Radio instance = new Radio(Constants.MIN_FM_FREQUENCY, Constants.MIN_AM_FREQUENCY);
        instance.changeModulation();
        instance.decrementFrequency();
        double expResult = 520.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testMaxBoundCrazyAMFrequency() {
        
        System.out.println("MaxBoundCrazyAMFrequency");
        Radio instance = new Radio(Constants.MAX_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        instance.changeModulation();
        
        instance.decrementFrequency();
        for(int i = 0; i < 2; i ++)
            instance.incrementFrequency();
        for(int i = 0; i < 8; i++)
            instance.decrementFrequency();
        for(int i = 0; i < 2; i++)
            instance.incrementFrequency();
        instance.decrementFrequency();
        
        double expResult = 1603.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
    /**
     * Test of decrementFrequency method, of class Radio.
     */
    @Test
    public void testMinBoundCrazyAMFrequency() {
        
        System.out.println("MinBoundCrazyAMFrequency");
        Radio instance = new Radio(Constants.MIN_FM_FREQUENCY, Constants.MAX_AM_FREQUENCY);
        instance.changeModulation();
        
        instance.incrementFrequency();
        for(int i = 0; i < 2; i ++)
            instance.decrementFrequency();
        for(int i = 0; i < 8; i++)
            instance.incrementFrequency();
        for(int i = 0; i < 2; i++)
            instance.decrementFrequency();
        instance.incrementFrequency();
        
        double expResult = 527.0;
        double result = instance.getFrequency();
        assertEquals(expResult, result, 0.01);
        
    }
    
    /**
     * Test of playFrequency method, of class Radio.
     */
    @Test
    public void testPlayFMFrequency() {
        
        System.out.println("playFMFrequency");
        Radio instance = new Radio();
        
        String expResult = "Playing radio at 87.5 FM frequency.";
        String result = instance.playFrequency();
        assertEquals(expResult, result);
      
    }
    
    /**
     * Test of playFrequency method, of class Radio.
     */
    @Test
    public void testPlayAMFrequency() {
        
        System.out.println("playAMFrequency");
        Radio instance = new Radio();
        instance.changeModulation();
        
        String expResult = "Playing radio at 520.0 AM frequency.";
        String result = instance.playFrequency();
        assertEquals(expResult, result);
      
    }
}
