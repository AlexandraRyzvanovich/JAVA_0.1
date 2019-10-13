package com.epam.oop.utils;

import com.epam.oop.tariff.Tariff;

import java.util.List;

public class ClientsCounter {
    public int getClientsCount(List<Tariff> list){
        int counter = 0;
        for (Tariff tariff: list) {
           counter += tariff.getClientsCount();
        }
        return counter;
    }
}
