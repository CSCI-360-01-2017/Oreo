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
    
    private final int MAX_VOLUME = 10; 
    private final int MIN_VOLUME = 0;
    private final double MIN_FM_FREQUENCY = 87.5;
    private final double MAX_FM_FREQUENCY = 108.1;
    private final double MIN_AM_FREQUENCY = 520.0;
    private final double MAX_AM_FREQUENCY = 1610.0;

    private String MOD_AM = "AM";
    private String MOD_FM = "FM";
  
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
        this.FMfrequency = this.MIN_FM_FREQUENCY;
        this.AMfrequency = this.MIN_AM_FREQUENCY;
        this.isFM = true;
        this.isOn = true;
    }
    
    public Radio(double FMfrequency, double AMfrequency) { // possibly make this private???
        
        this.volume = 5;
        this.FMfrequency = FMfrequency;
        this.AMfrequency = AMfrequency;
        this.isFM = true;
        this.isOn = true;
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
        
        if(this.volume < this.MAX_VOLUME)
        {
            this.volume = volume + 1;
        }
        else  // at cap
        {
            this.volume = volume;
        }
    }
    
     /**
     * @param volume the volume to decrement
     */
    public void decrementVolume() {
        
        if(this.volume > this.MIN_VOLUME)
        {
            this.volume = volume - 1;
        }
        else // at cap
        {
            this.volume = volume;
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
            if(this.FMfrequency < this.MAX_FM_FREQUENCY)
            {
                this.FMfrequency = this.FMfrequency + 0.2;
            }
            else // at cap
            {
                this.FMfrequency = this.FMfrequency;
            }
        }
        else // this.isFM == false
        {
            if(this.AMfrequency < this.MAX_AM_FREQUENCY)
            {
                this.AMfrequency = this.AMfrequency + 1.0;
            }
            else // at cap
            {
                this.FMfrequency = this.FMfrequency;
            }
        }
    }
    
    /**
     * @param frequency the frequency to decrement
     */
    public void decrementFrequency() {
        
        if(this.isFM == true)
        {
            if(this.FMfrequency > this.MIN_FM_FREQUENCY)
            {
                this.FMfrequency = this.FMfrequency - 0.2;
            }
            else // at cap
            {
                this.FMfrequency = this.FMfrequency;
            }
        }
        else // this.isFM == false
        {
            if(this.AMfrequency > this.MIN_AM_FREQUENCY)
            {
                this.AMfrequency = this.AMfrequency - 1.0;
            }
            else // at cap
            {
                this.FMfrequency = this.FMfrequency;
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
     * @return the volume
     */
    public boolean getisFM() {
        return isFM;
    }
    
    
    /*
    public void playFrequency() {
        
    }
    
    public void saveFrequency() {
        
    }*/
}
