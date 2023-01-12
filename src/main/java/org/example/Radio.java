package org.example;

public class Radio {
    private int radioWave;
    private int currentVolume;

    public int getradioWave() {
        return radioWave;
    }

    public void setRadioWave(int radioWave) {
        if (radioWave < 0) {
            return;
        }
        if (radioWave > 9) {
            return;
        }
        this.radioWave = radioWave;
    }

    public int getcurrentVolume() {
        return currentVolume;
    }

    public void setcurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (radioWave != 9) {
            radioWave++;
        } else {
            radioWave = 0;
        }
    }

    public void prev() {
        if (radioWave != 0) {
            radioWave--;
        } else {
            radioWave = 9;
        }
    }

    public void nextVolume() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            return;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            return;
        }
    }

}
