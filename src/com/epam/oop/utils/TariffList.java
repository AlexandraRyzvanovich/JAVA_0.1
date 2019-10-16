package com.epam.oop.utils;

import com.epam.oop.factory.TariffFactory;
import com.epam.oop.entity.Tariff;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TariffList {
    private static final Logger logger = LogManager.getLogger();
    public List<Tariff> tariffList = new ArrayList<>();

    public void initTariffList(ArrayList<String> list) {
        for (String line: list) {
            String[] arr = line.split("; ");
            TariffFactory tariffFactory = new TariffFactory();
            Tariff tariff = tariffFactory.getTariff(arr);
            if (tariff != null) {
                tariffList.add(tariff);
            }
        }
        logger.info("TariffList is generated");
    }
}
