package com.epam.test.reader;

import com.epam.oop.reader.DataReader;
import com.epam.oop.exception.DataReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class DataReaderTest {
    private DataReader dataReader;

    @BeforeClass
    public void setUp(){
        dataReader = new DataReader();
    }

    @DataProvider
    public Object[] validDataForReader(){
        return new Object[][]{
                {"./resources/tariffData", 4}

        };
    }

    @Test(dataProvider = "validDataForReader")
    public void readFileWithValidPathSuccessfully(String path, int expectedLength){
        ArrayList<String> actualList = dataReader.readFile(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), expectedLength );
    }

    @DataProvider
    public Object[] invalidDataForReader(){
        return new Object[]
                {"./resources/DataFileTest123"};
    }

    @Test(dataProvider = "invalidDataForReader", expectedExceptions = DataReaderException.class)
    public void readFileWithInvalidPathCatchException(String path) throws DataReaderException {
        dataReader.readFile(path);
    }
}
