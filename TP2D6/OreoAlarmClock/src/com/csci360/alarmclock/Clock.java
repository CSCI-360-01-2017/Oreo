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
    
    Time clockTime = new Time();

    
    
    public void printTotalTime()
    {
        System.out.print(String.format("%02d", clockTime.hour) + ":" + String.format("%02d", clockTime.minute) + " " + clockTime.meridien);
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
