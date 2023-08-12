package org.example;

public class Radio {
    private int curVolume = 50;
    private int curRStation = 0;
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
    public void previousRStation(){
        if (curRStation == 0) {
            curRStation = 9;
        }
        else {
            curRStation -= 1;
        }
    }
     public void nextRStation(){
        if (curRStation == 9) {
            curRStation = 0;
        }
        else {
            curRStation += 1;
        }
    }
    public long setRStation(int srs){
        if (srs > 10) {
            curRStation = 9;
        } else if (srs < 1) {
            curRStation = 0;
        } else {
            curRStation = srs - 1;
        } return curRStation; } public long getCurRStation() {
        int printStation = curRStation + 1;
        System.out.println("Current radio station");
        System.out.print(printStation);
        return curRStation;
    }
    public long getCurVolume() {
        int printVolume = curVolume;
        System.out.println("Current radio volume");
        System.out.print(printVolume);
        return curVolume;
    }
}