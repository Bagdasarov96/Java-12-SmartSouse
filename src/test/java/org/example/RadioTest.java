package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void choiceRadioWaveMax() {
        Radio radio = new Radio();
        radio.setRadioWave(9);
        int actual = radio.getradioWave();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void choiceRadioWaveMin() {
        Radio radio = new Radio();
        radio.setRadioWave(0);
        int actual = radio.getradioWave();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void nextWave() {
        Radio radio = new Radio();
        radio.setRadioWave(8);
        radio.next();
        int actual = radio.getradioWave();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextWaveBorder() {
        Radio radio = new Radio();
        radio.setRadioWave(9);
        radio.next();
        int actual = radio.getradioWave();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevWave() {
        Radio radio = new Radio();
        radio.setRadioWave(9);
        radio.prev();
        int actual = radio.getradioWave();
        int expected = 8;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevWaveMin() {
        Radio radio = new Radio();
        radio.setRadioWave(0);
        radio.prev();
        int actual = radio.getradioWave();
        int expected = 9;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void cecurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setcurrentVolume(100);
        int actual = radio.getcurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void cecurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setcurrentVolume(0);
        int actual = radio.getcurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setcurrentVolume(99);
        radio.nextVolume();
        int actual = radio.getcurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextVolumeMax() {
        Radio radio = new Radio();
        radio.setcurrentVolume(100);
        radio.nextVolume();
        int actual = radio.getcurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setcurrentVolume(1);
        radio.prevVolume();
        int actual = radio.getcurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void prevVolumeMin() {
        Radio radio = new Radio();
        radio.setcurrentVolume(0);
        radio.prevVolume();
        int actual = radio.getcurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void choiceRadioWaveOutsidMax() {
        Radio radio = new Radio();
        radio.setRadioWave(10);
        int actual = radio.getradioWave();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void choiceRadioWaveOutsideMin() {
        Radio radio = new Radio();
        radio.setRadioWave(-1);
        int actual = radio.getradioWave();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void cecurrentVolumeOutsideMax() {
        Radio radio = new Radio();
        radio.setcurrentVolume(101);
        int actual = radio.getcurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void cecurrentVolumeOutsideMin() {
        Radio radio = new Radio();
        radio.setcurrentVolume(-1);
        int actual = radio.getcurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void choiceRadioWave() {
        Radio radio = new Radio(-1);
        radio.setRadioWave(-1);
        int actual = radio.getradioWave();
        int expected = 0;
        Assertions.assertEquals(expected,actual);
    }

}
