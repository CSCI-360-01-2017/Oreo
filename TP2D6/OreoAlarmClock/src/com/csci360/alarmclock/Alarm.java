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
public class Alarm extends Clock{
    
   
    
    private int hour; // holds hours
    private int minute; // holds minutes
    private String meridien; // holds AM or PM
    
    
    
    private boolean isSet;
    
    
    
    public Alarm()
    {
        this.hour = 12;
        this.minute = 00;
        this.meridien = "AM"; // exchang this for a global final AM_MERIDIEN
        this.isSet = false;
    }
    
    /**
     * @return the hour
     */
    public int getAlarmHour() {
        return this.hour;
    }

    /**
     * @return the min
     */
    public int getAlarmMinute() {
        return this.minute;
    }

    /**
     * @return the alarmMod
     */
    public String getAlarmMeridien() {
        return this.meridien;
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
        super.userIncrementHour(this.hour);
    }
    
    public void incrementAlarmMinute()
    {
        super.userIncrementMinute(this.minute);
    }
    
    public boolean isAlarmTimeEqualToClockTime()
    {
        return this.hour == super.getHour() && this.minute == super.getMinute()
                && this.meridien.compareTo(super.getMeridien()) == 0;
    }
    
    public void soundAlarm()
    {
        if(this.isAlarmTimeEqualToClockTime())
        {
            Radio radio = new Radio();
            radio.playFrequency();
        }
        else
        {
            // do nothing
        }
    }
    
    public boolean isAlarming()
    {
        boolean alarming = false;
        
        if(this.isAlarmTimeEqualToClockTime())
        {
            alarming = true;
        }
        else 
        {
            // do nothing
        }
        
        return alarming;
    }
    
    public void snooze()
    {
        if(this.isAlarming())  // probably don't need to check if set
        {
            this.isSet = false;
            this.minute = this.minute + 9;
            this.isSet = true;
        }
        else {
            // do nothing
        }
        
    }
}
