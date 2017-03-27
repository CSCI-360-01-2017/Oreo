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
 * @author gabriellecozart, brielenbeamon
 */
public class Clock { 
    
    public Controller controller;
    private Time clockTime;
    private Timer timer;
    
    public Clock(Controller controller) {
        
        this.controller = controller;
        this.clockTime = new Time();
        this.timer = new Timer();
        startTimer();
        
    }
    
    public void printTotalTime()
    {
        System.out.print(String.format("%02d", clockTime.getHour()) + ":" + String.format("%02d", clockTime.getMinute()) + " " + clockTime.getMeridien());
    }
    
    public void startTimer()
    {
        timer.schedule( new TimerTask() {
            @Override
            public void run() {
                clockTimeIncrementMinute();
            }
        }, 0, Constants.MINUTE_INTERVAL); 
        System.out.print("Timer has begun");
        
    }
    
    public void stopTimer()
    {
        timer.cancel();
        System.out.print("Timer has stopped");
    }
    
   public void clockTimeIncrementMinute()
    {
        this.clockTime.timeIncrementMinute();
        this.controller.checkAlarm();
        System.out.println(this.clockTime.getTotalTime());
    }
    
    public Time getClockTime() {
        
        return clockTime;
        
    }
    
    /*public static void main(String[] args) {
        Clock myClock = new Clock(this.controller);
        myClock.startTimer();
    }*/
    
    
}
