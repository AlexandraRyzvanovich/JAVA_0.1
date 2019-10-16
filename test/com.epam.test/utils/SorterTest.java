package com.epam.test.utils;

import com.epam.oop.tariff.*;
import com.epam.oop.utils.Sorter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {
    private Sorter sorter;
    private List<Tariff> tariffs1;
    private List<Tariff> tariffs2;

    @BeforeClass
    public void setUp() {
        sorter = new Sorter();
        tariffs1 = new ArrayList<>();

        tariffs1.add(new BusinessTariff("Business", 100.0, CallerPackage.INTERNAL,
                "Cool tariff", 1000, InternetPackage.LIMITED, 500));
        tariffs1.add(new ClassicTariff("Classic", 50.0, CallerPackage.INTERNAL,
                "Cool tariff", 2000, 30));
        tariffs1.add(new ProTariff("Pro", 80.0, CallerPackage.INTERNAL,
                "Cool tariff", 30000, TVPackage.DIGITAL, InternetPackage.LIMITED));

        tariffs2 = new ArrayList<>();
        tariffs2.add(new BusinessTariff("Business", 1000.0, CallerPackage.INTERNAL,
                "Cool tariff", 50, InternetPackage.LIMITED, 500));
        tariffs2.add(new ClassicTariff("Classic", 1000.0, CallerPackage.INTERNAL,
                "Cool tariff", 100, 30));
        tariffs2.add(new ProTariff("Pro", 1000.0, CallerPackage.INTERNAL,
                "Cool tariff", 1800, TVPackage.DIGITAL, InternetPackage.LIMITED));
    }

    @Test
    public void sortByFeeTest(){
        List<Tariff> sortedList = sorter.sortByFee(tariffs1);
        Assert.assertEquals(sortedList.get(0).getSubscriptionFee(), 50.0 );
        Assert.assertEquals(sortedList.get(1).getSubscriptionFee(), 80.0 );
        Assert.assertEquals(sortedList.get(2).getSubscriptionFee(), 100.0 );
    }

    @Test
    public void sortByClientsAndFeeTest(){
        List<Tariff> sortedList = sorter.sortByClientsAndFee(tariffs2);
        Assert.assertEquals(sortedList.get(0).getClientsCount(), 50 );
        Assert.assertEquals(sortedList.get(1).getClientsCount(), 100 );
        Assert.assertEquals(sortedList.get(2).getClientsCount(), 1800 );
    }
}
