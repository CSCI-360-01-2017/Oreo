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
**Cross Preference:** Use Cases: Set Time, Set Alarm 1, Set Alarm 2

**Preconditions:** Device is powered

**Postconditions:**
* Hour is set

**Operation:** setMinute(minute)

**Cross Preference:** Use Cases: Set Time, Set Alarm 1, Set Alarm 2

**Preconditions:** Device is powered

**Postconditions:**
* Minute is set

---

##**Dismiss Alarm**

System Sequence Diagram:

![Domain Model](/Images/SSD_DismissAlarm.jpg)


Operation Contract:

**Operation:** turnOffAlarm()

**Cross Preference:** Use Cases: Dismiss Alarm 1, Dismiss Alarm 2, Snooze Alarm

**Preconditions:**
* Alarm is set
* Alarm goes off

**Postconditions:**
* Alarm is dismissed

---

##**Play Radio**

System Sequence Diagram:

![Domain Model](/Images/SSD_PlayRadio.jpg)


Operation Contracts:

**Operation:** turnOnRadio()

**Cross Preference:** Use Cases: Power Radio, Play Radio

**Preconditions:**
* Device is powered

**Postconditions:**
* Radio is powered




**Operation:** setModulation()

**Cross Preference:** Use Cases: Play Radio, Change Radio Station

**Preconditions:**
* Device is powered
* Radio is powered

**Postconditions:**
* Modulation is toggled between AM or FM




**Operation:** setStation()

**Cross Preference:** Use Cases: Power Radio, Play Radio, Change Radio Station

**Preconditions:**
* Device is powered
* Radio is powered
* Modulation is toggled between AM or FM

**Postconditions:**
* Radio station is set with specific frequency




**Operation:** adjustVolume(incrementByOne)

**Cross Preference:** Use Cases: Power Radio, Play Radio, Change Radio Volume

**Preconditions:**
* Device is powered
* Radio is powered
* Modulation is set
* Radio station is set

**Postconditions:**
* Volume is increased by one decibel




**Operation:** adjustVolume(decrementByOne)

**Cross Preference:** Use Cases: Power Radio, Play Radio, Change Radio Volume

**Preconditions:**
* Device is powered
* Radio is powered
* Modulation is set
* Radio station is set

**Postconditions:**
* Volume is decremented by one decibel


---

##**Change Radio Volume**

System Sequence Diagram:

![Domain Model](/Images/SSD_ChangeRadioVolume.jpg)


Operation Contract:

**Operation:** adjustVolume(incrementByOne)

**Cross Preference:** Use Cases: Power Radio, Play Radio, Change Radio Volume

**Preconditions:**
* Device is powered
* Radio is powered
* Modulation is set
* Radio station is set

**Postconditions:**
* Volume is increased by one decibel




**Operation:** adjustVolume(decrementByOne)

**Cross Preference:** Use Cases: Power Radio, Play Radio, Change Radio Volume

**Preconditions:**
* Device is powered
* Radio is powered
* Modulation is set
* Radio station is set

**Postconditions:**
* Volume is decremented by one decibel
