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
    
    private boolean setTime;
    private boolean alarm1ToggleBoolean;
    private boolean alarm2ToggleBoolean;
    private boolean alarm1EnabledBoolean;
    private boolean alarm2EnabledBoolean;
    private boolean soundAlarm;
    private Clock clock;
    private Alarm alarm1;
    private Alarm alarm2;
    private Radio radio;
    
    public Controller() {
        this.setTime = false;
        this.alarm1ToggleBoolean = false;
        this.alarm2ToggleBoolean = false;
        this.alarm1EnabledBoolean = false;
        this.alarm2EnabledBoolean = false;
        this.soundAlarm = false;
        this.clock = new Clock();
        this.alarm1 = new Alarm();
        this.alarm2 = new Alarm();
        this.radio = new Radio();
    }
    
    
    public Clock getClock()
    {
        return clock;
    }
    
    public void userIncrementHour() 
    {
        if (this.setTime) {
            this.clock.getClockTime().userIncrementHour();
        } else if (this.alarm1ToggleBoolean) {
            this.alarm1.incrementAlarmHour();
        } else if (this.alarm2ToggleBoolean) {
            this.alarm2.incrementAlarmHour();
        }
            
    }
    
    public void userIncrementMinute()
    {
        if (this.setTime) {
            this.clock.getClockTime().userIncrementMinute();
        } else if (this.alarm1ToggleBoolean) {
            this.alarm1.incrementAlarmMinute();
        } else if (this.alarm2ToggleBoolean) {
            this.alarm2.incrementAlarmMinute();
        }
    }
    
    public String getAlarm1Time()
    {
        return this.alarm1.getAlarmTime().toString();
    }
    
    public String getAlarm2Time()
    {
        return this.alarm2.getAlarmTime().toString();
    }
    
    public void toggleSetTime()
    {
        this.setTime = !this.setTime;
    }
    
    public void toggleSetAlarm1()
    {
        this.alarm1ToggleBoolean = !this.alarm1ToggleBoolean;
    }
    
    public void toggleSetAlarm2()
    {
        this.alarm2ToggleBoolean = !this.alarm2ToggleBoolean;
    }
    
    public boolean getAlarm1ToggleBoolean()
    {
        return this.alarm1ToggleBoolean;
    }
    
    public boolean getAlarm2ToggleBoolean()
    {
        return this.alarm2ToggleBoolean;
    }
    
    public void toggleAlarm1EnabledBoolean()
    {
        this.alarm1EnabledBoolean = !this.alarm1EnabledBoolean;
    }
    
    public void toggleAlarm2EnabledBoolean()
    {
        this.alarm2EnabledBoolean = !this.alarm2EnabledBoolean;
    }
    
    public boolean getAlarm1EnabledBoolean()
    {
        return this.alarm1EnabledBoolean;
    }
    
    public boolean getAlarm2EnabledBoolean()
    {
        return this.alarm2EnabledBoolean;
    }
    
    public Time getTime() 
    {
        return this.clock.getClockTime();
    }
    
    public boolean isAlarmSounding()
    {
        return this.soundAlarm;
    }
    
    public void setAlarmSounding()
    {
        this.soundAlarm = !this.soundAlarm;
    }
        
    /**
     * Checks each alarm time. Plays the radio if the alarm has been set and 
     * the alarm times match the clock time.
     */
    public void checkAlarm()
    {
        
        if(getAlarm1EnabledBoolean() && 
          alarm1.getAlarmTime().toString().equals(clock.getClockTime().toString()))
        {
            this.setAlarmSounding();        
        }
        
        else if(getAlarm2EnabledBoolean() && 
                alarm2.getAlarmTime().toString().equals(clock.getClockTime().toString()))
        {
            this.setAlarmSounding();
        }
        
        else {
            // do nothing
        }
    
    }
    public static Controller start() {
        Timer timer = new Timer();
        Controller trol = new Controller();
  
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                trol.clock.clockTimeIncrementMinute();
                trol.checkAlarm();      
            }
        };
        timer.schedule(task, 5000, 5000);
        
        return trol;
    }
    
}
