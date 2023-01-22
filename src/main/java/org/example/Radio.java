package org.example;

public class Radio {
    private int radioWave;
    private int currentVolume;
    private int maxStation;


    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount -1;
    }

    public int getradioWave() {
        return radioWave;
    }

    public void setRadioWave(int radioWave) {
        if (radioWave < 0) {
            return;
        }
        if (radioWave > maxStation) {
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
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (radioWave != maxStation) {
            radioWave++;
        } else {
            radioWave = 0;
        }
    }

    public void prev() {
        if (radioWave != 0) {
            radioWave--;
        } else {
            radioWave = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
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
