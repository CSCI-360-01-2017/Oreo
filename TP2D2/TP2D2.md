#  TP2 Deliverable 2
=======
###Team Oreo
#####February 2, 2017



---

**Use Case Name:** Dismiss Alarm

**Scope:** Software for dual alarm AM/FM clock radio.

**Level:** User Goal

**Primary Actor:** Owner

**Stakeholders and Interests:**
* Owner: Wants the alarm to turn off after they wake up at the specified time.
* Neighbor: Wants the alarm to turn off so they are not woken up or annoyed by alarm.
* Manufacturer: Wants the alarm to be able to turn off so they do not get bad reviews from consumers.
* Store: Wants alarm to disable so the consumer does not become unhappy and return item.

**Preconditions:** Alarm rings at specified time by consumer.

**Success Guarantee (or Postconditions):** Ringing alarm is disabled. Does not ring again until next specified time by user.

**Main Success Scenario (or Basic Flow):**

1. Owner sets a specified time for the alarm to ring.
2. Owner goes to sleep or goes about their day.
3. Time goes by and reaches time that alarm is set to ring.
4. Alarm rings.
5. Owner pushes button to disable ringing alarm.

**Extensions (or Alternative Flows):**

1. Alarm cannot be disabled.
2. Alarm continuously rings.
3. Neighbors and other member of the household are awakened by alarm.
4. Owner must unplug clock or remove in order to stop alarm.
5. Clock can no longer be used because of malfunction.
6. Clock must be returned to store.
7. Owner gives clock manufacturer bad reviews.

**Special Requirements:**
* An interface that displays time of day
* Button to change time. Hours and minutes separately.
* Mode that allows alarm to be set a specified time.
* Button to enable alarm.
* Button to disable alarm.
* Default alarm sound or radio station plays as alarm.

**Technology and Data Variations List:**
* Batteries for backup power.
* Antennae to receive local radio stations.

**Frequency of Occurrence:** Could be on a daily basis.

**Open Issues:**
* If  power goes out, is there a recovery system that resets alarm a specified time?
* Does alarm play at a certain volume, even if clocks volume is turned down?
* Clock does not take into account daylight savings time.
* Does alarm automatically stop after ringing for a certain amount of time?

---

**Use Case Name:** Play Radio

**Scope:** Software for dual alarm AM/FM clock radio.

**Level:** User Goal

**Primary Actor:** Owner

**Stakeholders and Interests:**
* Owner: Wants the radio to be played.
* Radio Station: Wants listeners to be able to tune in to their radio show.
* Manufacturer: Wants the device to be able to play radio stations so they do not get bad reviews from consumers.
* Store: Wants device to be able to play radio stations so the consumer does not become unhappy and return item.

**Preconditions:** Device is powered and owner has activated the radio.

**Success Guarantee (or Postconditions):** Radio is playing by control of the user.

**Main Success Scenario (or Basic Flow):**

1. Owner powers the clock
2. Owner turns on the radio option
3. Owner selects AM or FM
4. Owner selects station
5. Sound plays from device

**Extensions (or Alternative Flows):**

1. Owner turns on the Radio option
2. Owner can’t change from AM to FM or vice versa
3. Owner can’t select what station because nothing plays
4. Owner selects random station but can’t hear anything
5. Owner can’t change volume because there is no sound
6. Radio does not play (connectivity issues rather than sound malfunction)


**Special Requirements:**
* Power cord to power radio
* Button to turn radio on
* Potentiometer to select station
* Switch for AM/FM
* Dial for volume


**Technology and Data Variations List:**
* Batteries for backup power.
* Antennae to receive local radio stations.

**Frequency of Occurrence:** Could be on a daily basis.

**Open Issues:**
* If  power goes out, is there a recovery system that selects the previous radio station?
* Does radio keep simply start at the beginning of the radio frequencies every time radio mode is selected?

---

**Use Case Name:** Sound Alarm

**Scope:** Software for dual alarm AM/FM clock radio.

**Level:** User Goal

**Primary Actor:** Owner

**Stakeholders and Interests:**
* Owner: Wants the alarm to sound and therefore wake him up at a specified time.
* Manufacturer: Wants the alarm to be able to wake up a user so they do not get bad reviews from consumers.
* Store: Wants alarm to function properly so the customer does not become unhappy and return item.

**Preconditions:** Owner sets alarm before going to sleep.

**Success Guarantee (or Postconditions):** Owner wakes up to a ringing alarm.

**Main Success Scenario (or Basic Flow):**

1. Owner goes to sleep.
2. At the time the owner set the alarm for, an alarm goes off.
3. Owner wakes up do to sound.

**Extensions (or Alternative Flows):**

1. Owner goes to sleep.
2. The alarm is not loud enough to wake up owner.
3. Owner sleeps through the alarm and is late for work.

**Special Requirements:**
* An interface that displays time of day
* Button to change time. Hours and minutes separately.
* Mode that allows alarm to be set a specified time.
* Button to enable alarm.
* Default alarm sound or radio station plays as alarm.
* Toggle for owner to switch from alarm one to alarm two.

**Technology and Data Variations List:**
* Batteries for backup power.

**Frequency of Occurrence:** Could be on a daily basis.

**Open Issues:**
* In the case of a power outage, does the device serialize the alarms and keep them on once the power is restored?
* Is there a way to change the volume of the alarm?
* How does one set the alarm's sound? Does the alarm or radio go off?
* Does the alarm ring continuously until it has been disabled or is there a timer in case the owner is not home?

---

**Use Case Name:** Set Time

**Scope:** Software for dual alarm AM/FM clock radio.

**Level:** User Goal

**Primary Actor:** Owner

**Stakeholders and Interests:**
* Owner: Wants the device to keep accurate time.
* Manufacturer: Wants the device to keep a steady time that can sync to world clocks.
* Store: Wants device to function properly so the customer does not become unhappy and return item.

**Preconditions:** Owner has device plugged in/powered.

**Success Guarantee (or Postconditions):** Owner successfully sets the accurate time.

**Main Success Scenario (or Basic Flow):**

1. Owner switches to set time mode.
2. Owner changes the hour, minute, and am/pm setting to correspond with the current time.
3. The time is successfully set.

**Extensions (or Alternative Flows):**

1. Owner doesn't know how to switch to the set time mode.
2. When the time is set, it is set incorrectly.
3. The owner is late to work because he didn't set it correctly.

**Special Requirements:**
* An interface that displays time of day
* Button to change time. Hours and minutes separately.
* Button to change am/pm setting.

**Technology and Data Variations List:**
* Batteries for backup power.
* Power cord

**Frequency of Occurrence:** Could be on a daily basis.

**Open Issues:**
* Does the device take into account daylight savings time?
* Does the device have GPS to know what time zone it is in?

---

###**List of All Use Cases:**
* Dismiss Alarm
* Play Radio
* Sound Alarm
* Set Time
* Enable Alarm 1
* Enable Alarm 2
* Disable Alarm 1
* Disable Alarm 2
* Set Alarm 1
* Set Alarm 2
* Activate Snooze Mode
* Display Time
* Change Radio Station
* Change Alarm Sound
* Change Radio Volume
* Change Alarm Volume
* Power Radio
* Snooze Alarm

---

###**Domain Model**
![Domain Model](/Images/Domain_Model_Alarm_Clock.jpg)
