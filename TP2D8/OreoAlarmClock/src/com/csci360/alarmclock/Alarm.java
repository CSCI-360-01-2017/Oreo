/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author gabriellecozart, donovanroseau
 * 
 */
public class Alarm {
    
    private Time alarmTime;
    private boolean isSet;
    private boolean alarming;
    private Radio radio;
    
    
    
    public Alarm()
    {
        alarmTime = new Time();
        radio = new Radio();
        this.isSet = false;
        alarming = false;
    }
    
   
    
    public boolean getIsSet() {
        return this.isSet;
    }
    
    public void enableDisableAlarmSwitch()
    {
        if(this.isSet == false)
        {
            this.isSet = true;
        }
        else
        {
            this.isSet = false;
            
        }
    }
    
    public void incrementAlarmHour()
    {
        alarmTime.userIncrementHour();
    }
    
    public void incrementAlarmMinute()
    {
        alarmTime.userIncrementMinute();
    }

    public Time getAlarmTime() {
        return alarmTime;
    }
    
    public void soundAlarm()
    {
        alarming = true;
        radio.printPlayFrequency();
        
    }
    
    public boolean isAlarming()
    {
        return alarming;
    }
    
    public void snooze()
    {
        if(this.isAlarming())  // probably don't need to check if set
        {
            this.isSet = false;
            alarmTime.setMinute(alarmTime.getMinute() + 9);
            this.isSet = true;
        }
        else {
            // do nothing
        }
        
    }
    
}
