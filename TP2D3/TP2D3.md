#  TP2 Deliverable 3
=======
###Team Oreo
#####February 9, 2017

---

**System Sequence Model & Operation Contracts**

##**Set Time**

System Sequence Diagram:

![Domain Model](/Images/SSD_SetTime.jpg)


Operation Contracts:

**Operation:** setHour(hour)
**Cross Preference:** Use Cases: setTime, setAlarm1, setAlarm2
**Preconditions:** Device is powered.
**Postconditions:**
* Owner successfully sets the hour.
* Hour and am/pm setting is displayed.

**Operation:** setMinute(minute)
**Cross Preference:** Use Cases: setTime, setAlarm1, setAlarm2
**Preconditions:** Device is powered.
**Postconditions:**
* Owner successfully sets the minute.
* Minutes is displayed.

---

##**Dismiss Alarm**

System Sequence Diagram:

![Domain Model](/Images/SSD_DismissAlarm.jpg)


Operation Contracts:

**Operation:** turnOff()
**Cross Preference:** Use Cases: dismissAlarm1, dismissAlarm2, snooze1, snooze2
**Preconditions:**
* Owner sets alarm.
* Alarm goes off.
**Postconditions:**
* Alarm is dismissed.
