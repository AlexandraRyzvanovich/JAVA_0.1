package com.epam.oop.utils;

import com.epam.oop.factory.Factory;
import com.epam.oop.tariff.Tariff;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TariffList {
    public List<Tariff> tariffList = new ArrayList<>();
    public static final Logger logger = LogManager.getLogger();

    public void initTariffList(ArrayList<String> list){
        for (String line: list) {
            String[] arr = line.split("; ");
            Factory factory = new Factory();
            Tariff tariff = factory.getTariff(arr);
            if(tariff != null) {
                tariffList.add(tariff);
            }
            logger.info("TariffList is generated");
        }
    }
}
