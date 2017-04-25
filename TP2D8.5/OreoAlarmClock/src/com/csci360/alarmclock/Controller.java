/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author gabriellecozart, donovanroseau
 */
public class Controller {
    
    
    private boolean setTime;
    private boolean alarm1ToggleBoolean;
    private boolean alarm2ToggleBoolean;
    private boolean alarm1EnabledBoolean;
    private boolean alarm2EnabledBoolean;
    private boolean soundAlarm;
    private boolean soundAlarm1;
    private boolean soundAlarm2;
    private boolean isRadioOn;
    private Clock clock;
    private Alarm alarm1;
    private Alarm alarm2;
    private Radio radio;
    
    public Controller() {
        this.setTime = false;
        this.alarm1ToggleBoolean = false;
        this.alarm2ToggleBoolean = false;
        this.alarm1EnabledBoolean = false;
        this.alarm2EnabledBoolean = false;
        this.soundAlarm1 = false;
        this.soundAlarm2 = false;
        this.isRadioOn = false;
        this.clock = new Clock();
        this.alarm1 = new Alarm();
        this.alarm2 = new Alarm();
        this.radio = new Radio();
        this.radio.setVolume(5);
    }
    
    
    public Clock getClock()
    {
        return clock;
    }
    
    public void userIncrementHour() 
    {
        if (this.setTime) {
            this.clock.getClockTime().userIncrementHour();
        } else if (this.alarm1ToggleBoolean) {
            this.alarm1.incrementAlarmHour();
        } else if (this.alarm2ToggleBoolean) {
            this.alarm2.incrementAlarmHour();
        }
            
    }
    
    public void userIncrementMinute()
    {
        if (this.setTime) {
            this.clock.getClockTime().userIncrementMinute();
        } else if (this.alarm1ToggleBoolean) {
            this.alarm1.incrementAlarmMinute();
        } else if (this.alarm2ToggleBoolean) {
            this.alarm2.incrementAlarmMinute();
        }
    }
    
    public String getAlarm1Time()
    {
        return this.alarm1.getAlarmTime().toString();
    }
    
    public String getAlarm2Time()
    {
        return this.alarm2.getAlarmTime().toString();
    }
    
    public void toggleSetTime()
    {
        this.setTime = !this.setTime;
    }
    
    public void toggleSetAlarm1()
    {
        this.alarm1ToggleBoolean = !this.alarm1ToggleBoolean;
    }
    
    public void toggleSetAlarm2()
    {
        this.alarm2ToggleBoolean = !this.alarm2ToggleBoolean;
    }
    
    public boolean getAlarm1ToggleBoolean()
    {
        return this.alarm1ToggleBoolean;
    }
    
    public boolean getAlarm2ToggleBoolean()
    {
        return this.alarm2ToggleBoolean;
    }
    
    public void toggleAlarm1EnabledBoolean()
    {
        this.alarm1EnabledBoolean = !this.alarm1EnabledBoolean;
    }
    
    public void toggleAlarm2EnabledBoolean()
    {
        this.alarm2EnabledBoolean = !this.alarm2EnabledBoolean;
    }
    
    public boolean getAlarm1EnabledBoolean()
    {
        return this.alarm1EnabledBoolean;
    }
    
    public boolean getAlarm2EnabledBoolean()
    {
        return this.alarm2EnabledBoolean;
    }
    
    public Time getTime() 
    {
        return this.clock.getClockTime();
    }
    
    public boolean isAlarmSounding()
    {
        return this.soundAlarm1 || this.soundAlarm2;
    }
    
    public void setAlarmSounding1()
    {
        this.soundAlarm1 = !this.soundAlarm1;
    }
    
    public void setAlarmSounding2()
    {
        this.soundAlarm2 = !this.soundAlarm2;
    }
    
    public void setAlarmSounding()
    {
        this.soundAlarm = !this.soundAlarm;
    }
    
    public void alarm1Snooze()
    {
        this.alarm1.snooze();    
    }
    
    public void alarm2Snooze()
    {
        this.alarm2.snooze();
    }
    
    public String getVolumeString()
    {
        return Integer.toString(this.radio.getVolume());
    }
    
    public String userGetFrequencyString()
    {
        return this.radio.getFrequencyString();
    }
    
    public void userToggleIsFM()
    {
        this.radio.changeModulation();
    }
    
    public void userIncremenetFrequency() 
    {
        this.radio.incrementFrequency();  
    }
    
    public void userDecrementFrequency()
    {
        this.radio.decrementFrequency();  
    }
    
    public void userIncremenetVolume()
    {
        this.radio.incrementVolume();
    }
    
    public void userDecrementVolume()
    {
        this.radio.decrementVolume();
    }
    
    public void userToggleIsRadioOnBoolean()
    {
        this.isRadioOn = !this.isRadioOn;
    }
    
    public void userSnooze()
    {
        if(this.soundAlarm1) {
            this.alarm1.snooze();
        } else if(this.soundAlarm2) {
            this.alarm2.snooze();
        }
    }
    
    
    
    private File cameras = new File("sounds/Cameras.WAV");
    
    private File mrSaxobeat = new File("sounds/Mr_Saxobeat.WAV");
    private File dearMariaCountMeIn = new File("sounds/Dear_Maria_Count_Me_In.WAV");
    private File frontierPsychiatrist = new File("sounds/Frontier_Psychiatrist.WAV");
    private File goOutside = new File("sounds/Go_Outside.WAV");
    private File ifIDieYoung = new File("sounds/If_I_Die_Young.WAV");
    private File littleGames = new File("sounds/Little_Games.WAV");
    private File titanium = new File("sounds/Titanium_feat_Sia_.WAV");
    private File vivaLaVida = new File("sounds/Viva_la_Vida.WAV");
    private File HotlineBling = new File("sounds/Hotline_Bling.WAV");
    
    
    private File electricFeel = new File("sounds/Electric_Feel.WAV");
    private File iAlreadyForgotEverythingYouSaid = new File("sounds/I_Already_Forgot_Everything_You_Said.WAV");    
    private File mykonos = new File("sounds/Mykonos.WAV");
    private File peaches = new File("sounds/Peaches.WAV");
    private File pumpedUpKicks = new File("sounds/Pumped_Up_Kicks.WAV");
    private File tongueTied = new File("sounds/Tongue_Tied.WAV");
    private File sleepyhead = new File("sounds/Sleepyhead.WAV");
    private File sweaterWeather = new File("sounds/Sweater_Weather.WAV");
    private File migos = new File("sounds/Bad_And_Boujee.WAV");
    
    private Clip clip;
    private Clip alarm;

    public void playRadio()
    {
        File sound = getSong(this.radio.getFrequency());
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            
            
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
    
    public void changeDecibel() {
        if(this.radio.getVolume() == 0) {
            this.setMasterVolume(0.1f);
        } else if(this.radio.getVolume() == 1) {
            this.setMasterVolume(0.7f);
        } else if(this.radio.getVolume() == 2) {
            this.setMasterVolume(1.4f);
        } else if(this.radio.getVolume() == 3) {
            this.setMasterVolume(2.1f);
        } else if(this.radio.getVolume() == 4) {
            this.setMasterVolume(2.8f);
        } else if(this.radio.getVolume() == 5) {
            this.setMasterVolume(3.5f);
        } else if(this.radio.getVolume() == 6) {
            this.setMasterVolume(4.2f);
        } else if(this.radio.getVolume() == 7) {
            this.setMasterVolume(4.9f);
        } else if(this.radio.getVolume() == 8) {
            this.setMasterVolume(5.6f);
        } else if(this.radio.getVolume() == 9) {
            this.setMasterVolume(6.3f);
        } else if(this.radio.getVolume() == 10) {
            this.setMasterVolume(7.0f);
        } 
    }
    
    public void setMasterVolume(float value)
    {
        String command = "set volume " + value;
        try
        {
            ProcessBuilder pb = new ProcessBuilder("osascript","-e",command);
            pb.directory(new File("/usr/bin"));
            //System.out.println(command);
            StringBuffer output = new StringBuffer();
            Process p = pb.start();
            p.waitFor();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine())!= null)
            {
                output.append(line + "\n");
            }
            //System.out.println(output);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
     public void play(File sound)
    {
        
        try
        {
            Clip alarm = AudioSystem.getClip();
            alarm.open(AudioSystem.getAudioInputStream(sound));
            alarm.start();
            
            Thread.sleep(alarm.getMicrosecondLength()/1000);
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }  
    
    public void stopRadio()
    {
        clip.stop();
    }
    
    public void startAlarmSound(File sound)
    {
        
        try
        {
            alarm = AudioSystem.getClip();
            alarm.open(AudioSystem.getAudioInputStream(sound));
            alarm.start();
            
            Thread.sleep(alarm.getMicrosecondLength()/1000);
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
    
    public void stopAlarmSound()
    {
        alarm.stop();
    }
    
    private File getSong(Double frequency) {
        
        File requestedSong = this.cameras;
       
        if(this.radio.getIsFM()) {
            if(this.radio.getFrequency() == 87.5)
                requestedSong = this.littleGames;
            else if(this.radio.getFrequency() == 87.7)
                requestedSong = this.dearMariaCountMeIn;
            else if(this.radio.getFrequency() == 87.9)
                requestedSong = this.frontierPsychiatrist;
            else if(this.radio.getFrequency() > 88.1 && this.radio.getFrequency() < 88.3)
                requestedSong = this.goOutside;
            else if(this.radio.getFrequency() > 88.3 && this.radio.getFrequency() < 88.5)
                requestedSong = this.ifIDieYoung;
            else if(this.radio.getFrequency() > 88.5 && this.radio.getFrequency() < 88.7)
                requestedSong = this.mrSaxobeat;
            else if(this.radio.getFrequency() > 88.7 && this.radio.getFrequency() < 88.9)
                requestedSong = this.titanium;
            else if(this.radio.getFrequency() > 88.9 && this.radio.getFrequency() < 89.1)
                requestedSong = this.vivaLaVida;
            else if(this.radio.getFrequency() > 89.1 && this.radio.getFrequency() < 89.3)
                requestedSong = this.HotlineBling;
            else if(this.radio.getFrequency() > 89.3 && this.radio.getFrequency() < 89.5)
                requestedSong = this.migos;
                
        } else if(!this.radio.getIsFM()) {
            if(this.radio.getFrequency() == 520.0)
                requestedSong = this.electricFeel;
            else if (this.radio.getFrequency() == 521.0)
                requestedSong = this.iAlreadyForgotEverythingYouSaid;
            else if (this.radio.getFrequency() == 522.0)
                requestedSong = this.mykonos;
            else if (this.radio.getFrequency() == 523.0) 
                requestedSong = this.peaches;
            else if (this.radio.getFrequency() == 524.0)
                requestedSong = this.pumpedUpKicks;
            else if (this.radio.getFrequency() == 525.0)
                requestedSong = this.tongueTied;
            else if (this.radio.getFrequency() == 526.0)
                requestedSong = this.sleepyhead;
            else if (this.radio.getFrequency() == 527.0)
                requestedSong = this.sweaterWeather;
        }
        
        return requestedSong;
    }
        
    /**
     * Checks each alarm time. Plays the radio if the alarm has been set and 
     * the alarm times match the clock time.
     */
    public void checkAlarm()
    {
        
        if(getAlarm1EnabledBoolean() && 
          alarm1.getAlarmTime().toString().equals(clock.getClockTime().toString()))
        {
            this.setAlarmSounding1();        
        }
        
        else if(getAlarm2EnabledBoolean() && 
                alarm2.getAlarmTime().toString().equals(clock.getClockTime().toString()))
        {
            this.setAlarmSounding2();
        }
        
        else {
            // do nothing
        }
    
    }
    public static Controller start() {
        Timer timer = new Timer();
        Controller trol = new Controller();
  
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                trol.clock.clockTimeIncrementMinute();
                trol.checkAlarm();      
            }
        };

        timer.schedule(task, Constants.SECOND_INTERVAL, Constants.SECOND_INTERVAL);

        return trol;
    }

    public void updateRadio() {
        stopRadio();
        playRadio();
    }
    
}
