package com.epam.oop.utils;

import com.epam.oop.tariff.ProTariff;
import com.epam.oop.tariff.TVPackage;
import com.epam.oop.tariff.Tariff;

import java.util.List;

public class TariffFinder {

    public Tariff findByName(String name, List<Tariff> tariffList){
        for (Tariff tariff: tariffList) {
            if(tariff.getName().equals(name)){
                return tariff;
            }
        }
        return null;
    }

    public Tariff findByTvPackage(TVPackage tvPackage, List<Tariff> tariffList){
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
