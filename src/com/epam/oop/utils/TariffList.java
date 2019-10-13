package com.epam.oop.utils;

import com.epam.oop.factory.Factory;
import com.epam.oop.tariff.ProTariff;
import com.epam.oop.tariff.TVPackage;
import com.epam.oop.tariff.Tariff;

import java.util.ArrayList;
import java.util.List;

public class TariffList {
    public List<Tariff> tariffList = new ArrayList<Tariff>();

    public void initTariffList(ArrayList<String> list){
        for (String line: list) {
            String[] arr = line.split("; ");
            Factory factory = new Factory();
            Tariff tariff = factory.getTariff(arr);
            if(tariff != null) {
                tariffList.add(tariff);
            }
        }
    }

    public Tariff findByName(String name){
        for (Tariff tariff: tariffList) {
            if(tariff.getName().equals(name)){
                return tariff;
            }
        }
        return null;
    }

    public Tariff findByTvPackage(TVPackage tvPackage){
        for (Tariff tariff: tariffList) {
            if (tariff instanceof ProTariff) {
                if (((ProTariff) tariff).getTvPackage() == tvPackage) {
                    return tariff;
                }
            }
        }
        return null;
    }
}
