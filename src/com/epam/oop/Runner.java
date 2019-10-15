package com.epam.oop;

import com.epam.oop.datareader.Reader;
import com.epam.oop.tariff.Tariff;
import com.epam.oop.utils.TariffList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Reader reader = new Reader();
        ArrayList<String> list =  reader.readFile("./resources/tariffData");
        TariffList tariffList = new TariffList();

        tariffList.initTariffList(list);
        List<Tariff> l = tariffList.tariffList;
    }

}



