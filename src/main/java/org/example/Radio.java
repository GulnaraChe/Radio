package org.example;

public class Radio {
    private int curVolume = 50;
    private int curRStation = 0;
    private int maxRStation = 9;

    public void volumeDown(int i) {
        if (curVolume > 0) {
            curVolume -= i;
            if (curVolume < 0) {
                curVolume = 0;
            }
        }
    }

    public void volumeUp(int i) {
        if (curVolume < 100) {
            curVolume += i;
            if (curVolume > 100) {
                curVolume = 100;
            }
        }
    }

    public void previousRStation() {
        if (curRStation == 0) {
            curRStation = maxRStation;
        } else {
            curRStation -= 1;
        }
    }

    public void nextRStation() {
        if (curRStation == maxRStation) {
            curRStation = 0;
        } else {
            curRStation += 1;
        }
    }

    public void setMaxRStation(int smrs) {
        if (smrs < 2) {
            maxRStation = 1;
        } else {
            maxRStation = smrs - 1;
        }
    }

    public long setRStation(int srs) {
        if (srs > maxRStation + 1) {
            curRStation = maxRStation;
        } else if (srs < 1) {
            curRStation = 0;
        } else {
            curRStation = srs - 1;
        }
        return curRStation;
    }

    public long getCurRStation() {
        int printStation = curRStation + 1;
        System.out.println("Current radio station" + printStation);
        return curRStation;
    }

    public long getCurVolume() {
        int printVolume = curVolume;
        System.out.println("Current radio volume" + printVolume);
        return curVolume;
    }

    public long getMaxRStation() {
        int printMaxRStation = maxRStation + 1;
        System.out.println("Current max radio stations" + printMaxRStation);
        return maxRStation;
    }
}