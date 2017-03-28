/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author gabriellecozart, donovanroseau
 */
public class Controller {
    
    private boolean isSystemOn = false;
    private Clock clock = new Clock();
    private Alarm alarm1 = new Alarm();
    private Alarm alarm2 = new Alarm();
    
    public void plugInSystem()
    {
        this.isSystemOn = true;
        //this.clock.startTimer();
        
    }
    
    public void unplugSystem() // this is shit - Griffin
    {
        this.isSystemOn = false;
        this.clock.stopTimer();
    }
        
    public void checkAlarm()
    {
        
        Time timeOfAlarm1 = this.alarm1.getAlarmTime();
        Time timeOfAlarm2 = this.alarm2.getAlarmTime();
        Time timeOfClock = this.clock.getClockTime();
        
        if(this.alarm1.getIsSet() && timeOfAlarm1.equals(timeOfClock))
        {
            alarm1.soundAlarm();        
        }
        
        else if(this.alarm2.getIsSet() && timeOfAlarm2.equals(timeOfClock))
        {
            alarm2.soundAlarm();
        }
        
        else {
            // do nothing
        }
    
    }
}
