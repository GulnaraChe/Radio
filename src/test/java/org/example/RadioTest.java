package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void firstVolumeUpTest() {
        Radio service = new Radio();
        service.volumeUp(30);
        long expected = 80;
        long actual = service.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondVolumeUpTest() {
        Radio service = new Radio();
        service.volumeUp(51);
        long expected = 100;
        long actual = service.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstVolumeDownTest() {
        Radio service = new Radio();
        service.volumeDown(30);
        long expected = 20;
        long actual = service.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondVolumeDownTest() {
        Radio service = new Radio();
        service.volumeDown(51);
        long expected = 0;
        long actual = service.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstNextRStationTest() {
        Radio service = new Radio();
        service.nextRStation();
        long expected = 1;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondNextRStationTest() {
        Radio service = new Radio();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        service.nextRStation();
        long expected = 0;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstPreviousRStationTest() {
        Radio service = new Radio();
        service.previousRStation();
        long expected = 9;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondPreviousRStationTest() {
        Radio service = new Radio();
        service.previousRStation();
        service.previousRStation();
        long expected = 8;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstSetRStationTest() {
        Radio service = new Radio();
        service.setRStation(11);
        long expected = 9;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondSetRStationTest() {
        Radio service = new Radio();
        service.setRStation(0);
        long expected = 0;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void thirdSetRStationTest() {
        Radio service = new Radio();
        service.setRStation(1);
        long expected = 0;
        long actual = service.getCurRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstSetMaxRStationTest() {
        Radio service = new Radio();
        service.setMaxRStation(15);
        long expected = 14;
        long actual = service.getMaxRStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondSetMaxRStationTest() {
        Radio service = new Radio();
        service.setMaxRStation(0);
        long expected = 1;
        long actual = service.getMaxRStation();
        Assertions.assertEquals(expected, actual);
    }
}
