package com.epam.oop.factory;

import com.epam.oop.tarifInfo.Tariff;
import com.epam.oop.tarifInfo.TouristTariff;

public class Factory {
    Tariff getTariff(String line){
        String [] data=line.split(";");
        switch (data[0]){
            case "Business":
                return new Tariff();
            default:
                return new Tariff();

        }

    }


}
