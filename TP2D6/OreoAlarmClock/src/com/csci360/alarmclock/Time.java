/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author gabriellecozart
 */
public class Time {
    
    private int hour;
    private int minute; 
    private String meridien;
    
    public Time()
    {
        this.hour = 12;
        this.minute = 0;
        this.meridien = Constants.AM_MERIDIEN;
    }
    
    public Time(int hour, int minute, String meridien)
    {
        this.hour = hour;
        this.minute = minute;
        this.meridien = meridien;
    }
    
    // for testing use only
    public void setHour(int hour)
    {
        this.hour = hour;
    }
    
    // for testing use only
    public void setMinute(int minute)
    {
        this.minute = minute;
    }
    
    // for testing use only
    public void setMeridien(String meridien)
    {
        this.meridien = meridien;
    }
    
    public int getHour()
    {
        return this.hour; // returns hours
    }
    
    public int getMinute()
    {
        return this.minute; // returns minute
    }
    
    public String getMeridien()
    {
        return this.meridien; // returs AM or PM
    }
    
    public void timeIncrementHour()
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
    
    public void timeIncrementMinute()
    {
        if (this.minute == 59)
        {
            this.minute = 0;
            this.timeIncrementHour();
        }
        else
        {
            this.minute ++; 
        }
    }
    
    public void switchMeridien()
    {
        if(this.meridien.compareTo(Constants.AM_MERIDIEN) == 0)
        {
            this.meridien = Constants.PM_MERIDIEN;
        }
        else
        {
            this.meridien = Constants.AM_MERIDIEN;
        }
    }
    
    public void userIncrementHour()
    {
        this.timeIncrementHour();
    }
    
    public void userIncrementMinute()
    {
       this.minute = (this.minute + 1) % 60; 
    }
    
    @Override
    public boolean equals(Object other) 
    {
        boolean result = false;
        if(other instanceof Time)
        {
            Time otherTime = (Time) other;
            if(this.hour == otherTime.getHour() && this.minute == otherTime.getMinute() && this.meridien.equals(otherTime.getMeridien()))
            {
                result = true;
            }
        }
        return result;
    }
    
    
    public String getTotalTime()
    {
        return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + " " + this.meridien;
    }
    
    
    
    
}
