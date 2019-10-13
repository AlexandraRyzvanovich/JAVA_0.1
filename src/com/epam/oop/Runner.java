package com.epam.oop;


import com.epam.oop.datareader.Reader;
import com.epam.oop.tariff.CallerPackage;
import com.epam.oop.tariff.Tariff;
import com.epam.oop.utils.Sorter;
import com.epam.oop.utils.TariffList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Runner {
    public static void main(String[] args) {
        //Reader -> Factory -> Validator ->  TariffList<> ->
        // TariffList -> sort (price)
        //(calculate clients)  -> Add client (use TariffList) -> ClientsList -> Calculate
        //Logger
            //finder ???
        Reader reader = new Reader();
        ArrayList<String> array =  reader.readFile("C:\\Users\\Alexandra\\IdeaProjects\\JAVA_0.1\\resources\\tariffData");
        TariffList list = new TariffList();
        list.initTariffList(array);
        Sorter sortere = new Sorter();
        sortere.sortByFee(list.tariffList);







    }
}
