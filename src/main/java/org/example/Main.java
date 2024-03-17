package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Radio {
    private int numStations; // количество радиостанций
    private int currentStation; // номер текущей радиостанции
    private int currentVolume; // уровень громкости звука

    public Radio() {
        this(10); // По умолчанию 10 радиостанций
    }

    public Radio(int numStations) {
        this.numStations = numStations;
        this.currentStation = 0;
        this.currentVolume = 50; // начальный уровень громкости
    }

    public void next() {
        currentStation = (currentStation + 1) % numStations;
    }

    public void prev() {
        currentStation = (currentStation == 0) ? numStations - 1 : currentStation - 1;
    }

    public void setStation(int station) {
        if (station >= 0 && station < numStations) {
            currentStation = station;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
