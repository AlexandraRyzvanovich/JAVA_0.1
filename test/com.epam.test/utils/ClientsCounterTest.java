package com.epam.test.utils;

import com.epam.oop.tariff.*;
import com.epam.oop.utils.ClientsCounter;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ClientsCounterTest {
    private ClientsCounter clientsCounter;
    private List<Tariff> tariffs;


    @BeforeClass
    public void setUp() {
        clientsCounter = new ClientsCounter();
        tariffs = new ArrayList<>();
        tariffs.add(new BusinessTariff("Business", 100.0, CallerPackage.INTERNAL,
                "Cool tariff", 1000, InternetPackage.LIMITED, 500));
        tariffs.add(new ClassicTariff("Classic", 50.0, CallerPackage.INTERNAL,
                "Cool tariff", 1000, 30));
    }

    @Test
    public void calculateClientsTest(){
        double clientsCount = clientsCounter.getClientsCount(tariffs);
        Assert.assertEquals(clientsCount, 2000.0);
    }
}
