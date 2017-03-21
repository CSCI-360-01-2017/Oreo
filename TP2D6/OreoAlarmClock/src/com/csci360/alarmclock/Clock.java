/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author brielenbeamon
 */
public class Clock {
    
    //create private global variables for the clock
    private int hour; // holds hours
    private int minute; // holds minutes
    private String mod; // holds AM or PM

    public Clock()
    {
        this.hour = 12;
        this.minute = 00;
        this.mod = "AM";
    }
    
    public void setHour(int hour)
    {
        this.hour = hour; // sets hours
    }
    
    public void setMinute(int minute)
    {
        this.minute = minute; // sets minutes
    }
    
    public void setModulation(String mod)
    {
        this.mod = mod; // sets modulation
    }
    
    public int getHour()
    {
        return this.hour; // returns hours
    }
    public int getMinute()
    {
        return this.minute; // returns minute
    }
    
    public String getMod()
    {
        return this.mod; // returs modulation
    }
    
    public void incHour()
    {
        // add one to this.hour
        this.hour += 1;
        // switch the modulation once the hour number reaches 12
        if (this.hour == 12)
        {
            this.switchMod();
        }
        // all other numbers that are greater than twelve will reset back to 1
        else if (this.hour > 12)
        {
            this.hour = 1;
        }
    }
    
    public void incMinute()
    {
        // reset minute back to 0 wants the minute reches 60
        this.minute = (this.minute + 1)%60;
    }
    
    
    
    public void switchMod()
    {
        if(this.mod.equals("AM"))
        {
            this.mod = "PM";
        }
        else
        {
            this.mod = "AM";
        }
    }
    
    public void printHour()
    {
        System.out.print(this.hour); // prints hours
    }
    
    public void printMinute()
    {
        System.out.print(this.minute); // prints minutes
    }
    
    public void printMod()
    {
        System.out.println(this.mod); // prints modulation
    }
    
    
}
