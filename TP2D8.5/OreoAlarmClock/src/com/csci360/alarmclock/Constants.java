/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author gabriellecozart
 */
public class Constants {
    
    // Time Constants
    
    public static final String AM_MERIDIEN = "AM";
    public static final String PM_MERIDIEN = "PM";
    
    public static final int MINUTE_INTERVAL = 15000; // time of each minute in milliseconds
    public static final int SECOND_INTERVAL = 1000;

    
    // Radio Constants
    
    public static final int MAX_VOLUME = 10; 
    public static final int MIN_VOLUME = 0;
    public static final double MIN_FM_FREQUENCY = 87.5;
    public static final double MAX_FM_FREQUENCY = 108.1;
    public static final double MIN_AM_FREQUENCY = 520.0;
    public static final double MAX_AM_FREQUENCY = 1610.0;

    public static final String MOD_AM = "AM";
    public static final String MOD_FM = "FM";
    public static final double FM_INTERVAL = 0.2;
    public static final double AM_INTERVAL = 1.0;
    
}
