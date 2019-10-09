package com.epam.oop.tarifInfo;

public class ClassicTariff extends Tariff {

    private int freeSMS;

    public int freeSMS() {
        return freeSMS;
    }

    public void freeSMS(int freeSMS) {
        this.freeSMS = freeSMS;
    }
}
