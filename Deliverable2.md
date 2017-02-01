# Deliverable 2
===============
###Team Oreo
#####February 2, 2017



---

**Use Case Name:** Disable Alarm

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
