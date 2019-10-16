package com.epam.test.factory;

import com.epam.oop.exception.FactoryException;
import com.epam.oop.factory.Factory;
import com.epam.oop.entity.Tariff;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactoryTest {
    private Factory factory;

    @BeforeClass
    public void setUp() {
        factory = new Factory();
    }

    @DataProvider
    public Object[] validDataForFactory() {
        return new Object[][]{
                {new String[]{"Classic", "50", "Internal", "Tariff for people who like to talk", "1050", "100"}, 50.0, 1050},
                {new String[]{"Business", "100", "Full",  "Tariff for a business team", "6000", "Unlimited", "100"}, 100.0, 6000}
        };
    }

    @Test(dataProvider = "validDataForFactory" )
    public void createNewObject(String[] array, double expectedFee, int expectedClientsCount){
        Tariff tariff = factory.getTariff(array);
        Assert.assertNotNull(tariff);
        Assert.assertEquals(tariff.getSubscriptionFee(), expectedFee);
        Assert.assertEquals(tariff.getClientsCount(), expectedClientsCount);
    }
    @DataProvider
    public Object[] invalidDataForFactory() {
        return new Object[][]{
                {new String[]{"Classic", "50", "Internal567", "Tariff for people who like to talk", "1050", "100"}},
                {new String[]{"Classic"}}
        };
    }

    @Test(dataProvider = "invalidDataForFactory", expectedExceptions = FactoryException.class)
    public void createNewObjectFromInvalidData(String[] array) throws FactoryException {
        Tariff tariff = factory.getTariff(array);
    }




}

