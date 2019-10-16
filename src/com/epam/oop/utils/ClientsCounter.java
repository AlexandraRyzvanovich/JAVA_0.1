package com.epam.oop.utils;

import com.epam.oop.exception.UtilsException;
import com.epam.oop.tariff.Tariff;

import java.util.List;

public class ClientsCounter {
    public double getClientsCount(List<Tariff> list) {
        if (list.size() == 0) {
            throw new UtilsException("List is empty. Impossible to calculate clients");
        }
        int counter = 0;
        for (Tariff tariff: list) {
           counter += tariff.getClientsCount();
        }
        return counter;
    }
}
