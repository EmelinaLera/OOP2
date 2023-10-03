package ru.netology.radio;
public class Radio {
    public int currentRadioStation;
    public int soundVolume;

public void next() {
    if (currentRadioStation !=9) {
        currentRadioStation++; }
    else {
        currentRadioStation = 0;
    }
    }
    public void prev() {
    if (currentRadioStation !=0) {
        currentRadioStation--;
    }
    else {currentRadioStation = 9;}
}
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }

    }
        public void setSoundVolume (int soundVolume) {
            if (soundVolume < 0) {
                return;
            }
            if (soundVolume > 100) {
                return;
            }
            this.soundVolume = soundVolume;
        }

        public void decreaseVolume() {
            if (soundVolume != 0) {
                soundVolume --;}
            else soundVolume = 0;
                }
            }


