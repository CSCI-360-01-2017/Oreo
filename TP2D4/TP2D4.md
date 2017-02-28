#  TP2 Deliverable 4
=======
###Team Oreo
#####February 21, 2017

---

Set Time
--------------
Objects: Controller, Clock

Methods: incrementHour(), incrementMinutes()



![Domain Model](/Images/SD_SetTime.jpg)

---

Sound Alarm
-------------
Objects: AlarmController, Clock, Radio, Alarm1, Alarm2

Method: sendAlarmTime(), checkAlarmTime(), soundAlarm(alarmName), playRadio()



![Domain Model](/Images/SD_SoundAlarm.jpg)

---

Play Radio
----------
Objects: Controller, Radio

Methods: turnOnRadio(), setModulation(), setStation(), incrementVolume(), decrementVolume()



![Domain Model](/Images/SD_PlayRadio.jpg)

---

Change Volume
-------------

Objects: Controller, Radio

Methods: incrementVolume(), decrementVolume()




![Domain Model](/Images/SD_ChangeVolume.jpg)

---

Snooze Alarm
------------
Objects: Controller, AlarmController, Alarm1, Alarm2

Methods: snooze(), checkActive(), dismissAlarm(), resetAlarmPlusNineMinutes()



![Domain Model](/Images/SD_SnoozeAlarm.jpg)
