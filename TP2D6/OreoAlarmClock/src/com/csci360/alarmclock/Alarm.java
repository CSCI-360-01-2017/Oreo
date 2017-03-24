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
    
    public void setHour(int hour)
    {
        this.hour = hour;
    }
    
    public void setMinute(int minute)
    {
        this.minute = minute;
    }
    
    public void setMeridien(String meridien)
    {
        this.meridien = meridien;
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
        if (this.hour == 12)
        {
            this.hour = 1;
        }
        else if (this.hour == 11)
        {
            this.hour ++;
            this.switchMeridien();
        }
        else {
            this.hour ++; 
        }
    }
    
    public void incrementAlarmMinute()
    {
        this.minute = (this.minute + 1) % 60;
    }
    
    public boolean isAlarmTimeEqualToClockTime()
    {
        boolean result = false;
        
        if(this.isSet)
        {
            result = this.hour == super.getHour() && this.minute == super.getMinute() 
                    && this.meridien.compareTo(super.getMeridien()) == 0;
        }
        else
        {
            // do nothing
        }
        
        return result;
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
