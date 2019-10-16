package com.epam.test.utils;

import com.epam.oop.entity.*;
import com.epam.oop.utils.TariffFinder;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TariffFinderTest {
    private TariffFinder finder;
    private List<Tariff> tariffs;

    @BeforeClass
    public void setUp() {
        finder = new TariffFinder();
        tariffs = new ArrayList<>();

        tariffs.add(new BusinessTariff("Business", 100.0, CallerPackage.INTERNAL,
                "Cool tariff", 1000, InternetPackage.LIMITED, 500));
        tariffs.add(new ClassicTariff("Classic", 50.0, CallerPackage.INTERNAL,
                "Cool tariff", 2000, 30));
        tariffs.add(new ProTariff("Pro", 80.0, CallerPackage.INTERNAL,
                "Cool tariff", 30000, TVPackage.DIGITAL, InternetPackage.LIMITED));
    }

    @Test
    public void findByValidNameTest(){
        Tariff actualTariff = finder.findByName("Classic", tariffs);
        Assert.assertEquals(actualTariff.getName(), "Classic");
    }

    @Test
    public void findByInvalidNameTest(){
        Tariff actualTariff = finder.findByName("Something", tariffs);
        Assert.assertNull(actualTariff);
    }

    @Test
    public void findByValidTVPackageTest() {
        Tariff actualTariff = finder.findByTvPackage(TVPackage.DIGITAL, tariffs);
        Assert.assertEquals(actualTariff.getName(), "Pro");
    }

    @Test
    public void findByInvalidTVPackageTest() {
        Tariff actualTariff = finder.findByTvPackage(TVPackage.MOBILE, tariffs);
        Assert.assertNull(actualTariff);
    }
}
