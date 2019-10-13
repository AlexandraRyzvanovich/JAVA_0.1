package com.epam.test.factory;

import com.epam.oop.exception.FactoryException;
import com.epam.oop.factory.Factory;
import com.epam.oop.tariff.Tariff;
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
    public Object[] validDataForReader() {
        return new Object[][]{
                {new String[]{"Classic", "50", "Internal", "Tariff for people who like to talk", "1050", "100"}}

        };
    }

    @Test(dataProvider = "validDataForReader" )
    public void createNewObject(String[] array){
        Tariff tariff = factory.getTariff(array);
        Assert.assertNotNull(tariff);
        Assert.assertEquals(tariff.getClientsCount(), 1050 );
    }
    @DataProvider
    public Object[] invalidDataForReader() {
        return new Object[][]{
                {new String[]{"Classic", "50", "Internal567", "Tariff for people who like to talk", "1050", "100"}}

        };
    }

    @Test(dataProvider = "invalidDataForReader", expectedExceptions = FactoryException.class)
    public void createNewObjectFromInvalidData(String[] array) throws FactoryException {
        Tariff tariff = factory.getTariff(array);
    }




}

