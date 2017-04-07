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
 * @author gabriellecozart, donovanroseau
 */
public class Controller {
    
    //private boolean isSystemOn = false;
    private Clock clock = new Clock();
    private Alarm alarm1 = new Alarm();
    private Alarm alarm2 = new Alarm();
    private Radio radio = new Radio();
    
    /*public void plugInSystem()
    {
        this.isSystemOn = true;
        //this.clock.startTimer();
        
    }
    
    public void unplugSystem()
    {
        this.isSystemOn = false;
        this.clock.stopTimer();
    }*/
        
    /**
     * Checks each alarm time. Plays the radio if the alarm has been set and 
     * the alarm times match the clock time.
     */
    public void checkAlarm()
    {
        
        this.alarm1.getAlarmTime();
        this.alarm2.getAlarmTime();
        //Time timeOfAlarm2 = this.alarm2.getAlarmTime();
        //Time timeOfClock = this.clock.getClockTime();
        
        if(alarm1.getIsSet() == true && 
          alarm1.getAlarmTime().getTotalTime().equals(clock.getClockTime().getTotalTime()))
        {
            alarm1.soundAlarm();        
        }
        
        else if(alarm2.getIsSet() == true && 
                alarm2.getAlarmTime().getTotalTime().equals(clock.getClockTime().getTotalTime()))
        {
            alarm2.soundAlarm();
        }
        
        else {
            // do nothing
        }
    
    }
    public static void main(String[] args) {
        Timer timer = new Timer();
        Controller trol = new Controller();
  
        trol.alarm1.getAlarmTime();
        trol.alarm1.enableDisableAlarmSwitch();
        
        trol.alarm2.getAlarmTime();
        
        trol.alarm1.incrementAlarmMinute();
        trol.alarm1.incrementAlarmMinute();
        trol.alarm1.incrementAlarmMinute();
        
        trol.alarm2.incrementAlarmMinute();
        trol.alarm2.incrementAlarmMinute();

        
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                trol.clock.clockTimeIncrementMinute();
                trol.checkAlarm();
           
                
            }
        };
        timer.schedule(task, 5000, 5000);
    }
    
}
