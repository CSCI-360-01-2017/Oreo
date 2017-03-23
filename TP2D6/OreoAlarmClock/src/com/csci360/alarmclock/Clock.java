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
    
    //create private global variables for the clock
    
    public final String AM_MERIDIEN = "AM";
    public final String PM_MERIDIEN = "PM";

    
    public static int hour; // holds hours
    public static int minute; // holds minutes
    private String meridien; // holds AM or PM

    public Clock()
    {
        this.hour = 12;
        this.minute = 0;
        this.meridien = this.AM_MERIDIEN;
    }
    
    public Clock(int hour, int minute, String meridien)
    {
        this.hour = hour;
        this.minute = minute;
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
        if(this.meridien.compareTo(this.AM_MERIDIEN) == 0)
        {
            this.meridien = this.PM_MERIDIEN;
        }
        else
        {
            this.meridien = this.AM_MERIDIEN;
        }
    }
    
    public void userIncrementMinute(int minute)
    {
       this.minute = (this.minute + 1) % 60; 
    }
    
    public void userIncrementHour(int hour)
    {
        this.timeIncrementHour();
    }
    
    public String getTotalTime()
    {
        return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + " " + this.meridien;
    }
    
    public void start()
    {
        System.out.print("Timer has begun");
    }
    
    public void stop()
    {
        System.out.print("Timer has stopped");
    }
    
   
    
}
