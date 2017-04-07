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
    
    
    /*
    * Constructor
    */
    public Alarm()
    {
        alarmTime = new Time();
        this.isSet = false;
        alarming = false;
        radio = new Radio();
        
    }
    
    public Alarm(int hour, int minute, String meridien)
    {
        this();
        alarmTime.setHour(hour);
        alarmTime.setMinute(minute);
        alarmTime.setMeridien(meridien);
              
    }
    
   
    /*
    *Checks if the alarm is set
    */
    public boolean getIsSet() {
        return this.isSet;
    }
    
   /**
    *Enables and disables alarm
    *If alarm is enabled then the function disables it and vice versa
    */
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
    
    /**
    *Increments the hour for the alarm by 1
    */
    public void incrementAlarmHour()
    {
        alarmTime.userIncrementHour();
    }
    
    /*
    *Increments the minutes of the alarm by 1
    */
    public void incrementAlarmMinute()
    {
        alarmTime.userIncrementMinute();
    }
    
    /**
    *Return the alarmTime
    */
    public Time getAlarmTime() {
        return alarmTime;
    }
    
    /**
    *Plays the the radio when the alarm sounds
    */
    public void soundAlarm()
    {
        alarming = true;
        radio.printPlayFrequency();
        
    }
    
    /**
    *Checks if the alarm is sounding
    */
    public boolean isAlarming()
    {
        return alarming;
    }
    
    /**
    *Adds 9 minutes to the alarm time
    */
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
