/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author gabriellecozart, brielenbeamon, donovanroseau
 */
public class Clock { 
    
    public Controller controller;
    private Time clockTime;
    private Timer timer;
    
    public Clock() {
        this.controller = controller;
        this.clockTime = new Time();
        //this.timer = new Timer();
        //timer.schedule(new RemindTask(), seconds * 1000);
        
    }
    
    public String getTotalTime()
    {
        return String.format("%02d", clockTime.getHour()) + ":" + String.format("%02d", clockTime.getMinute()) + " " + clockTime.getMeridien();
    }
    
    
   public void clockTimeIncrementMinute()
    {
        this.clockTime.timeIncrementMinute();
    }
    
    public Time getClockTime() 
    {
        
        return clockTime;
        
    }
}
