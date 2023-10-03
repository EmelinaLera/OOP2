package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RadioTest {

    @Test
    public void shouldBackToZeroIfCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.next();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxIfCurrentStationZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBeyondMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBeyondMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBeforeMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetZeroRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenItMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseVolumeOneUnit() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseVolumeWhenItMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseVolumeWhenItOne() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseVolumeOnUnit() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBeyondMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeFromOne() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSoundVolumeMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSoundVolumeMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSoundVolumeBeyondMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(-2);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSoundVolumeBeyondMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(120);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

}