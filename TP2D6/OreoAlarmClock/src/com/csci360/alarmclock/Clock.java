/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author gabriellecozart, brielenbeamon
 */
public class Clock { 
    
    public Controller controller;
    private Time clockTime;
    
    public Clock(Controller cont) {
        
        this.controller = cont;
        clockTime = new Time();
    }
    
    public void printTotalTime()
    {
        System.out.print(String.format("%02d", clockTime.getHour()) + ":" + String.format("%02d", clockTime.getMinute()) + " " + clockTime.getMeridien());
    }
    
    public void start()
    {
        System.out.print("Timer has begun");
    }
    
    public void stop()
    {
        System.out.print("Timer has stopped");
    }
    
   public void clockTimeIncrementMinute()
    {
        this.clockTime.timeIncrementMinute();
        this.controller.checkAlarm();
    }
    
    public Time getClockTime() {
        
        return clockTime;
        
    }
}
