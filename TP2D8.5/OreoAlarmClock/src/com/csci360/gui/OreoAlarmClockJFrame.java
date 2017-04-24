package com.csci360.gui;


import com.csci360.alarmclock.Controller;
import com.csci360.alarmclock.Time;
import java.awt.Color;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriellecozart
 */
public class OreoAlarmClockJFrame extends javax.swing.JFrame {

    /**
     * Creates new form OreoAlarmClockJFrame
     */
    public OreoAlarmClockJFrame() {
        initComponents();
        //styles();
        Timer timer = new Timer();
        this.controller = Controller.start();
        this.FMButton.setSelected(true);
        
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                updateTimeLabel();
            }
        };
        timer.schedule(task, 500, 500);
        this.FrequencyLabel.setVisible(false);
    }
    
    private void styles() {
        
        Color backgroundColor = new Color(238, 238, 238);
        Color button = new Color(76, 36, 59);
        
        this.SnoozeButton.setBackground(button);
        this.Alarm1OnOffSwitch.setBackground(button);
        this.Alarm1ToggleButton.setBackground(button);
        this.Alarm2OnOffSwitch.setBackground(button);
        this.Alarm2ToggleButton.setBackground(button); 
        this.HourButton.setBackground(button);
        this.MinuteButton.setBackground(button);
        this.TimeToggleButton.setBackground(button);
        this.ClockPanel.setBackground(backgroundColor);
        this.AlarmToggleSpacerPanel.setBackground(backgroundColor);
        this.topPanelBuffer.setBackground(backgroundColor);
        this.bottomPanelBuffer.setBackground(backgroundColor);
        this.ClockControlPanel.setBackground(backgroundColor);
        this.AlarmSetPanel.setBackground(backgroundColor);
        this.AlarmTogglePanel.setBackground(backgroundColor);
        this.jTabbedPane1.setBackground(backgroundColor);
        this.RadioPanel.setBackground(backgroundColor);
        this.jPanel2.setBackground(backgroundColor);
        this.jPanel3.setBackground(backgroundColor);
        this.radioButtonPanel.setBackground(backgroundColor);
        this.frequencyPanel.setBackground(backgroundColor);
        this.volumePanel.setBackground(backgroundColor);
        this.FMAMPanel.setBackground(backgroundColor);
        this.playRadioButton.setBackground(button);
        this.decrementFequencyButton.setBackground(button);
        this.incrementFequencyButton.setBackground(button);
        this.DecrementVolumeButton.setBackground(button);
        this.IncrementVolumeButton.setBackground(button);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FMAMButtonGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ClockPanel = new javax.swing.JPanel();
        topPanelBuffer = new javax.swing.JPanel();
        ClockControlPanel = new javax.swing.JPanel();
        TimeToggleButton = new javax.swing.JToggleButton();
        HourButton = new javax.swing.JButton();
        MinuteButton = new javax.swing.JButton();
        SnoozeButton = new javax.swing.JButton();
        AlarmSetPanel = new javax.swing.JPanel();
        Alarm1ToggleButton = new javax.swing.JToggleButton();
        Alarm2ToggleButton = new javax.swing.JToggleButton();
        AlarmTogglePanel = new javax.swing.JPanel();
        Alarm1OnOffSwitch = new javax.swing.JToggleButton();
        AlarmToggleSpacerPanel = new javax.swing.JPanel();
        Alarm2OnOffSwitch = new javax.swing.JToggleButton();
        TimeLabel = new javax.swing.JLabel();
        bottomPanelBuffer = new javax.swing.JPanel();
        RadioPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        radioButtonPanel = new javax.swing.JPanel();
        playRadioButton = new javax.swing.JToggleButton();
        frequencyPanel = new javax.swing.JPanel();
        decrementFequencyButton = new javax.swing.JButton();
        FrequencyLabel = new javax.swing.JLabel();
        incrementFequencyButton = new javax.swing.JButton();
        volumePanel = new javax.swing.JPanel();
        DecrementVolumeButton = new javax.swing.JButton();
        VOLUME_LABEL = new javax.swing.JLabel();
        volumeLabel = new javax.swing.JLabel();
        IncrementVolumeButton = new javax.swing.JButton();
        FMAMPanel = new javax.swing.JPanel();
        FMButton = new javax.swing.JRadioButton();
        AMButton = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();

        FMAMButtonGroup.add(AMButton);
        FMAMButtonGroup.add(FMButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oreo Alarm Clock");

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 102));
        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        ClockPanel.setLayout(new java.awt.GridLayout(6, 1));

        javax.swing.GroupLayout topPanelBufferLayout = new javax.swing.GroupLayout(topPanelBuffer);
        topPanelBuffer.setLayout(topPanelBufferLayout);
        topPanelBufferLayout.setHorizontalGroup(
            topPanelBufferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        topPanelBufferLayout.setVerticalGroup(
            topPanelBufferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        ClockPanel.add(topPanelBuffer);

        ClockControlPanel.setLayout(new java.awt.GridLayout(1, 0));

        TimeToggleButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TimeToggleButton.setText("Set Time");
        TimeToggleButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        TimeToggleButton.setPreferredSize(new java.awt.Dimension(50, 20));
        TimeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeToggleButtonActionPerformed(evt);
            }
        });
        ClockControlPanel.add(TimeToggleButton);

        HourButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        HourButton.setText("Hour");
        HourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourButtonActionPerformed(evt);
            }
        });
        ClockControlPanel.add(HourButton);

        MinuteButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        MinuteButton.setText("Minute");
        MinuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinuteButtonActionPerformed(evt);
            }
        });
        ClockControlPanel.add(MinuteButton);

        SnoozeButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        SnoozeButton.setText("Snooze");
        SnoozeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnoozeButtonActionPerformed(evt);
            }
        });
        ClockControlPanel.add(SnoozeButton);

        ClockPanel.add(ClockControlPanel);

        AlarmSetPanel.setLayout(new java.awt.GridLayout(1, 0));

        Alarm1ToggleButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Alarm1ToggleButton.setText("Set Alarm 1");
        Alarm1ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alarm1ToggleButtonActionPerformed(evt);
            }
        });
        AlarmSetPanel.add(Alarm1ToggleButton);

        Alarm2ToggleButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Alarm2ToggleButton.setText("Set Alarm 2");
        Alarm2ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alarm2ToggleButtonActionPerformed(evt);
            }
        });
        AlarmSetPanel.add(Alarm2ToggleButton);

        ClockPanel.add(AlarmSetPanel);

        AlarmTogglePanel.setLayout(new java.awt.GridLayout(1, 0));

        Alarm1OnOffSwitch.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Alarm1OnOffSwitch.setText("Alarm 1 Off");
        Alarm1OnOffSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alarm1OnOffSwitchActionPerformed(evt);
            }
        });
        AlarmTogglePanel.add(Alarm1OnOffSwitch);

        javax.swing.GroupLayout AlarmToggleSpacerPanelLayout = new javax.swing.GroupLayout(AlarmToggleSpacerPanel);
        AlarmToggleSpacerPanel.setLayout(AlarmToggleSpacerPanelLayout);
        AlarmToggleSpacerPanelLayout.setHorizontalGroup(
            AlarmToggleSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        AlarmToggleSpacerPanelLayout.setVerticalGroup(
            AlarmToggleSpacerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        AlarmTogglePanel.add(AlarmToggleSpacerPanel);

        Alarm2OnOffSwitch.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Alarm2OnOffSwitch.setText("Alarm 2 Off");
        Alarm2OnOffSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alarm2OnOffSwitchActionPerformed(evt);
            }
        });
        AlarmTogglePanel.add(Alarm2OnOffSwitch);

        ClockPanel.add(AlarmTogglePanel);

        TimeLabel.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("12:00 AM");
        TimeLabel.setToolTipText("");
        ClockPanel.add(TimeLabel);

        javax.swing.GroupLayout bottomPanelBufferLayout = new javax.swing.GroupLayout(bottomPanelBuffer);
        bottomPanelBuffer.setLayout(bottomPanelBufferLayout);
        bottomPanelBufferLayout.setHorizontalGroup(
            bottomPanelBufferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        bottomPanelBufferLayout.setVerticalGroup(
            bottomPanelBufferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        ClockPanel.add(bottomPanelBuffer);

        jTabbedPane1.addTab("Clock", ClockPanel);

        RadioPanel.setLayout(new java.awt.GridLayout(6, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        RadioPanel.add(jPanel2);

        radioButtonPanel.setLayout(new java.awt.GridLayout(1, 0));

        playRadioButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        playRadioButton.setText("Turn On Radio");
        playRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playRadioButtonActionPerformed(evt);
            }
        });
        radioButtonPanel.add(playRadioButton);

        RadioPanel.add(radioButtonPanel);

        frequencyPanel.setLayout(new java.awt.GridLayout(1, 0));

        decrementFequencyButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        decrementFequencyButton.setText("<");
        decrementFequencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrementFequencyButtonActionPerformed(evt);
            }
        });
        frequencyPanel.add(decrementFequencyButton);

        FrequencyLabel.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        FrequencyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FrequencyLabel.setText("87.5 FM");
        FrequencyLabel.setToolTipText("");
        frequencyPanel.add(FrequencyLabel);

        incrementFequencyButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        incrementFequencyButton.setText(">");
        incrementFequencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrementFequencyButtonActionPerformed(evt);
            }
        });
        frequencyPanel.add(incrementFequencyButton);

        RadioPanel.add(frequencyPanel);

        volumePanel.setLayout(new java.awt.GridLayout(1, 0));

        DecrementVolumeButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        DecrementVolumeButton.setText("<");
        DecrementVolumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecrementVolumeButtonActionPerformed(evt);
            }
        });
        volumePanel.add(DecrementVolumeButton);

        VOLUME_LABEL.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        VOLUME_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        VOLUME_LABEL.setText("Volume: ");
        volumePanel.add(VOLUME_LABEL);

        volumeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        volumeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeLabel.setText("5");
        volumePanel.add(volumeLabel);

        IncrementVolumeButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        IncrementVolumeButton.setText(">");
        IncrementVolumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncrementVolumeButtonActionPerformed(evt);
            }
        });
        volumePanel.add(IncrementVolumeButton);

        RadioPanel.add(volumePanel);

        FMAMPanel.setLayout(new java.awt.GridLayout(1, 0));

        FMButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        FMButton.setText("FM");
        FMButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FMButtonActionPerformed(evt);
            }
        });
        FMAMPanel.add(FMButton);

        AMButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        AMButton.setText("AM");
        AMButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMButtonActionPerformed(evt);
            }
        });
        FMAMPanel.add(AMButton);

        RadioPanel.add(FMAMPanel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        RadioPanel.add(jPanel3);

        jTabbedPane1.addTab("Radio", RadioPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Clock");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Clock tab
    
    private void SnoozeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnoozeButtonActionPerformed
        // TODO add your handling code here:

        //this.controller.userSnooze();
        //this.controller.stopAlarmSound();
        if((this.controller.isAlarmSounding() && this.Alarm1OnOffSwitch.isSelected()))
        {
            this.controller.alarm1Snooze();
            this.controller.setAlarmSounding1();
           
        }
        
         if((this.controller.isAlarmSounding() && this.Alarm2OnOffSwitch.isSelected()))
        {
            this.controller.alarm2Snooze();
            this.controller.setAlarmSounding();
           
        }
        
    }//GEN-LAST:event_SnoozeButtonActionPerformed

    private void HourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HourButtonActionPerformed
        // TODO add your handling code here:
        this.controller.userIncrementHour();
        this.updateTimeLabel();
    }//GEN-LAST:event_HourButtonActionPerformed

    private void Alarm1ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alarm1ToggleButtonActionPerformed
        // TODO add your handling code here:
        this.controller.toggleSetAlarm1();
        this.updateTimeLabel();
    }//GEN-LAST:event_Alarm1ToggleButtonActionPerformed

    private void TimeToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeToggleButtonActionPerformed
        // TODO add your handling code here:
        this.controller.toggleSetTime();
    }//GEN-LAST:event_TimeToggleButtonActionPerformed

    private void MinuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinuteButtonActionPerformed
        // TODO add your handling code here:
        this.controller.userIncrementMinute();
        this.updateTimeLabel();
    }//GEN-LAST:event_MinuteButtonActionPerformed

    private void Alarm2ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alarm2ToggleButtonActionPerformed
        // TODO add your handling code here:
        this.controller.toggleSetAlarm2();
        this.updateTimeLabel();
    }//GEN-LAST:event_Alarm2ToggleButtonActionPerformed

    private void Alarm1OnOffSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alarm1OnOffSwitchActionPerformed
        // TODO add your handling code here:
        if(this.Alarm1OnOffSwitch.isSelected())
        {
            this.Alarm1OnOffSwitch.setText("Alarm 1 On");
            this.controller.toggleAlarm1EnabledBoolean();
        }
        else
        {
            this.Alarm1OnOffSwitch.setText("Alarm 1 Off");
            this.controller.toggleAlarm1EnabledBoolean();

        }
    }//GEN-LAST:event_Alarm1OnOffSwitchActionPerformed

    private void Alarm2OnOffSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alarm2OnOffSwitchActionPerformed
        // TODO add your handling code here:
        if(this.Alarm2OnOffSwitch.isSelected())
        {
            this.Alarm2OnOffSwitch.setText("Alarm 2 On");
            this.controller.toggleAlarm2EnabledBoolean();

        }
        else
        {
            this.Alarm2OnOffSwitch.setText("Alarm 2 Off");
            this.controller.toggleAlarm2EnabledBoolean();

        }
    }//GEN-LAST:event_Alarm2OnOffSwitchActionPerformed

    // Radio Tab
    
    private void decrementFequencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrementFequencyButtonActionPerformed
        // TODO add your handling code here:
        if(this.playRadioButton.isSelected())
        {
            this.controller.stopRadio();
            this.controller.userDecrementFrequency();
        }
        this.updateFrequencyLabel();
        this.controller.playRadio();
    }//GEN-LAST:event_decrementFequencyButtonActionPerformed

    private void incrementFequencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrementFequencyButtonActionPerformed
        // TODO add your handling code here:
        if(this.playRadioButton.isSelected())
        {
            this.controller.stopRadio();
            this.controller.userIncremenetFrequency();
        }
        this.updateFrequencyLabel();
        this.controller.playRadio();
        
    }//GEN-LAST:event_incrementFequencyButtonActionPerformed

    private void FMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FMButtonActionPerformed
        // TODO add your handling code here: 
        this.controller.userToggleIsFM();
        this.updateFrequencyLabel();
        this.controller.updateRadio();
    }//GEN-LAST:event_FMButtonActionPerformed

    private void AMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMButtonActionPerformed
        // TODO add your handling code here:
        this.controller.userToggleIsFM();
        this.updateFrequencyLabel();
        this.controller.updateRadio();
    }//GEN-LAST:event_AMButtonActionPerformed

    private void DecrementVolumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecrementVolumeButtonActionPerformed
        // TODO add your handling code here:
        this.controller.userDecrementVolume();
        System.out.println(this.controller.getVolumeString());
        this.updateVolumeLabel();
    }//GEN-LAST:event_DecrementVolumeButtonActionPerformed

    private void IncrementVolumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncrementVolumeButtonActionPerformed
        // TODO add your handling code here:
        this.controller.userIncremenetVolume();
        this.updateVolumeLabel();
    }//GEN-LAST:event_IncrementVolumeButtonActionPerformed

    private void playRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playRadioButtonActionPerformed
        // TODO add your handling code here:
        if(this.playRadioButton.isSelected())
        {
            this.FrequencyLabel.setVisible(true);
            this.playRadioButton.setText("Turn Off Radio");
            this.controller.playRadio();

        }
        else
        {
            this.FrequencyLabel.setVisible(false);
            this.playRadioButton.setText("Turn On Radio");
            this.controller.stopRadio();

        }
    }//GEN-LAST:event_playRadioButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OreoAlarmClockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OreoAlarmClockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OreoAlarmClockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OreoAlarmClockJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OreoAlarmClockJFrame().setVisible(true);
            }
        });
        
       
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AMButton;
    private javax.swing.JToggleButton Alarm1OnOffSwitch;
    private javax.swing.JToggleButton Alarm1ToggleButton;
    private javax.swing.JToggleButton Alarm2OnOffSwitch;
    private javax.swing.JToggleButton Alarm2ToggleButton;
    private javax.swing.JPanel AlarmSetPanel;
    private javax.swing.JPanel AlarmTogglePanel;
    private javax.swing.JPanel AlarmToggleSpacerPanel;
    private javax.swing.JPanel ClockControlPanel;
    private javax.swing.JPanel ClockPanel;
    private javax.swing.JButton DecrementVolumeButton;
    private javax.swing.ButtonGroup FMAMButtonGroup;
    private javax.swing.JPanel FMAMPanel;
    private javax.swing.JRadioButton FMButton;
    private javax.swing.JLabel FrequencyLabel;
    private javax.swing.JButton HourButton;
    private javax.swing.JButton IncrementVolumeButton;
    private javax.swing.JButton MinuteButton;
    private javax.swing.JPanel RadioPanel;
    private javax.swing.JButton SnoozeButton;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JToggleButton TimeToggleButton;
    private javax.swing.JLabel VOLUME_LABEL;
    private javax.swing.JPanel bottomPanelBuffer;
    private javax.swing.JButton decrementFequencyButton;
    private javax.swing.JPanel frequencyPanel;
    private javax.swing.JButton incrementFequencyButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton playRadioButton;
    private javax.swing.JPanel radioButtonPanel;
    private javax.swing.JPanel topPanelBuffer;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JPanel volumePanel;
    // End of variables declaration//GEN-END:variables

    Controller controller;
    File alarmSound = new File("sounds/beep-06.WAV");

   
    
    private void blinkTime()
    {
        this.TimeLabel.setVisible(!this.TimeLabel.isVisible());
    }
    
    
    // refactor
    private void soundAlarm()
    {
        if(this.controller.isAlarmSounding() && this.Alarm1OnOffSwitch.isSelected())
        {

            this.controller.startAlarmSound(alarmSound);

           // this.play(alarmSound);
           if (!this.Alarm1OnOffSwitch.isSelected() && this.controller.isAlarmSounding())
           {
                this.controller.setAlarmSounding1();
               
           }

        }
        
        if((this.controller.isAlarmSounding() && this.Alarm2OnOffSwitch.isSelected()))
        {
            this.controller.play(alarmSound);
            if (!this.Alarm2OnOffSwitch.isSelected() && this.controller.isAlarmSounding())
            {
                this.controller.setAlarmSounding();
            }
        }
       
    }
    
   
    
    private void updateTimeLabel() {
        
        if(this.TimeToggleButton.isSelected()) {
            blinkTime();
            this.TimeLabel.setText(this.controller.getTime().toString());
        } else if(this.Alarm1ToggleButton.isSelected()) {
            blinkTime();
            this.TimeLabel.setText(this.controller.getAlarm1Time());
        } else if(this.Alarm2ToggleButton.isSelected()) {
            blinkTime();
            this.TimeLabel.setText(this.controller.getAlarm2Time());    
        } else {
            this.TimeLabel.setVisible(true);
            this.TimeLabel.setText(this.controller.getTime().toString());
            soundAlarm();
        }
        
    }
    
    private void updateVolumeLabel() {

        this.volumeLabel.setText(this.controller.getVolumeString());    
    }
    
    private void updateFrequencyLabel() {
        
        this.FrequencyLabel.setText(this.controller.userGetFrequencyString());
    }
    

}
