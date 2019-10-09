package com.epam.oop.utils;

import com.epam.oop.tarifInfo.Tariff;

public class Adder {
    Tariff t = new Tariff();
    int counter = t.getCounter();

    public void addClient(Tariff tariff, String[] clientData){
        Tariff.setCounter(++counter);
    }
}
