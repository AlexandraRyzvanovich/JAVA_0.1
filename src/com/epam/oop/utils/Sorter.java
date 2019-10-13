package com.epam.oop.utils;

import com.epam.oop.tariff.Tariff;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public List<Tariff> sortByFee(List<Tariff> list){
        List<Tariff> sortedList = list.stream().sorted().collect(Collectors.toList());

    return sortedList;
    }
}
