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
public class Controller {
    
    private boolean isSystemOn = false;
    private Clock clock = new Clock();
    private Alarm alarm1 = new Alarm();
    private Alarm alarm2 = new Alarm();
    
    public void plugInSystem()
    {
        this.isSystemOn = true;
        this.clock.start();
        
    }
    
    public void unplugSystem()
    {
        this.isSystemOn = false;
        this.clock.stop();
    }
    
}
