/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author gabriellecozart
 */
public class Alarm {
    
    /**
     */
    public long myLong = 2;
    Timer timer;
    
    public Alarm(int seconds)
    {
        timer = new Timer();
        timer.schedule(new RemindTask(), 
                0, 
                seconds*1000);
    }
    
    class RemindTask extends TimerTask {
        int counter = 5;
        public void run() {
            if(counter > 0)
            {
                System.out.println(counter);
                counter--;
            }
            else
            {
            System.out.format("Time's up!%n");
            timer.cancel(); //Terminate the timer thread
            System.exit(0);
            }
        }
    }
    
}
