package com.epam.test.utils;

import com.epam.oop.entity.Tariff;
import com.epam.oop.utils.TariffList;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TariffListTest {
    private TariffList tariffList;
    private ArrayList<String> initialList;

    @BeforeClass
    public void setUp(){
        tariffList = new TariffList();
        initialList = new ArrayList<>();
        initialList.add("Business; 100; Full;  Tariff for a business team; 6000; Unlimited; 100");
        initialList.add("Pro; 200; External; Tariff for people who like to surf the Net; 5000; Satellite; Unlimited");
        initialList.add("Tourist; 300; Internal; Tariff for travellers; 2000; Asia");
    }

    @Test
    public void initTariffListTest(){
        tariffList.initTariffList(initialList);
        List<Tariff> actualList = tariffList.tariffList;
        Assert.assertEquals(actualList.size(), 3 );
    }
}
