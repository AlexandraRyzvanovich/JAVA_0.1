package com.epam.oop.utils;

import com.epam.oop.factory.Factory;
import com.epam.oop.tariff.Tariff;

import java.util.ArrayList;
import java.util.List;

public class TariffList {
    public List<Tariff> getTariffList(ArrayList<String> list){
        List<Tariff> tariffList = null;
        for (String line: list) {
            String[] arr = line.split("; ");
            Factory factory = new Factory();
            Tariff tariff = factory.getTariff(arr);
            tariffList.add(tariff);
        }
        return tariffList;
    }
}
