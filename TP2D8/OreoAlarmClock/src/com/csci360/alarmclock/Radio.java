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
public class Radio {
    
    
  
    private int volume;
    private double AMfrequency;
    private double FMfrequency;
    private boolean isFM;
    private boolean isOn;
    
    
    /**
     * Constructor
     */
    public Radio() {
        
        this.volume = 5;
        this.FMfrequency = Constants.MIN_FM_FREQUENCY;
        this.AMfrequency = Constants.MIN_AM_FREQUENCY;
        this.isFM = true;
        this.isOn = true;
    }
    
    public Radio(double FMfrequency, double AMfrequency) { // possibly make this private???
        
        this();
        this.FMfrequency = FMfrequency;
        this.AMfrequency = AMfrequency;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }
    
     /**
     * @param volume the volume to increment
     */
    public void incrementVolume() {
        
        if(this.volume < Constants.MAX_VOLUME)
        {
            this.volume = volume + 1;
        }
        else  // at cap
        {
            // do nothing
        }
    }
    
     /**
     * @param volume the volume to decrement
     */
    public void decrementVolume() {
        
        if(this.volume > Constants.MIN_VOLUME)
        {
            this.volume = volume - 1;
        }
        else // at cap
        {
            // do nothing
        }
    }
  

    /**
     * @return the frequency
     */
    public double getFrequency() {
        
        double result = 0.0;
        if(this.isFM == true)
        {
            result = this.FMfrequency;
        }
        else // this.isFM == false
        {
            result = this.AMfrequency;
        }
        return result;
    }
    
    /**
     * @param frequency the frequency to increment
     */
    public void incrementFrequency() {
        
        if(this.isFM == true)
        {
            if(this.FMfrequency < Constants.MAX_FM_FREQUENCY)
            {
                this.FMfrequency = this.FMfrequency + Constants.FM_INTERVAL;
            }
            else // at cap
            {
                // do nothing
            }
        }
        else // this.isFM == false
        {
            if(this.AMfrequency < Constants.MAX_AM_FREQUENCY)
            {
                this.AMfrequency = this.AMfrequency + Constants.AM_INTERVAL;
            }
            else // at cap
            {
                // do nothing
            }
        }
    }
    
    /**
     * @param frequency the frequency to decrement
     */
    public void decrementFrequency() {
        
        if(this.isFM == true)
        {
            if(this.FMfrequency > Constants.MIN_FM_FREQUENCY)
            {
                this.FMfrequency = this.FMfrequency - Constants.FM_INTERVAL;
            }
            else // at cap
            {
                // do nothing
            }
        }
        else // this.isFM == false
        {
            if(this.AMfrequency > Constants.MIN_AM_FREQUENCY)
            {
                this.AMfrequency = this.AMfrequency - Constants.AM_INTERVAL;
            }
            else // at cap
            {
                // do nothing
            }
        }
    } 
    
    
    /**
     * @param isFM the Modulation to change
     */
    public void changeModulation() {
        if(this.isFM == true)
        {
            this.isFM = false;
        }
        else 
        {
            this.isFM = true;
        }
    }
    
    
    /**
     * @return FM boolean
     */
    public boolean getisFM() {
        return isFM;
    }
    
    /**
     * @return the volume
     */
    public String getModString() {
        
        String result = Constants.MOD_FM; 
        
        if(this.isFM == true)
        {
            result = Constants.MOD_FM;
        }
        else
        {
            result = Constants.MOD_AM;
        }
        
        return result;
    }  
    
    public String playFrequency() 
    {
        return "Playing radio at " + this.getFrequency() + " " + this.getModString() + " frequency.";
        
    }
    
    public void printPlayFrequency() 
    {
        System.out.println("Playing radio at " + this.getFrequency() + this.getModString() + " frequency.");

    }
    
  
}
