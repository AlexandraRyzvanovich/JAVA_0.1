package com.epam.oop.tarifInfo;

import com.epam.oop.tariffModules.InternetPackage;
import com.epam.oop.tariffModules.MinutesPackage;

import java.util.List;

public class TouristTariff extends Tariff {
    private List<String> countries;

    public List<String> getCountries() {
        return countries;
    }
}
