package com.epam.oop.sorter;

import com.epam.oop.entity.Tariff;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TariffSorter {
    private final Comparator<Tariff> comparator1;
    private final Comparator<Tariff> comparator2;

    public TariffSorter() {
        comparator1 = Comparator.comparing(obj -> obj.getSubscriptionFee());
        comparator2 = comparator1.thenComparing(obj -> obj.getClientsCount());
    }

    public List<Tariff> sortByFee(List<Tariff> list) {

        return list.stream().sorted(comparator1).collect(Collectors.toList());
    }

    public List<Tariff> sortByClientsAndFee(List<Tariff> list) {

        return list.stream().sorted(comparator2).collect(Collectors.toList());
    }
}
