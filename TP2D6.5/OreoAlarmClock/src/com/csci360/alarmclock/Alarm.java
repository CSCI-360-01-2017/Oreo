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
    
    private int hour;
    private int min;
    private String alarmMod = "AM";
    boolean isOn = false;
    
    public void setAlarm(int hour, int min, String alarmMod)
    {
       this.hour = hour;
       this.min = min;
       this.alarmMod = alarmMod;
       this.isOn = true;
    }
    
    public void turnOff()
    {
        isOn = false;
        
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @return the alarmMod
     */
    public String getAlarmMod() {
        return alarmMod;
    }
    
}
