/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

/**
 *
 * @author donovanroseau
 */
public class Alarm {
    
    public int hour;
    public int min;
    String alarmMod = "AM";
    boolean isOn = false;
    
    public void setAlarm(int hour, int min, String alarmMod)
    {
       this.hour = hour;
       this.min = min;
       this.alarmMod = alarmMod;
       this.isOn = true;
    }
    
    public boolean isOn()
    {
        return isOn;
        
    }
    
}
