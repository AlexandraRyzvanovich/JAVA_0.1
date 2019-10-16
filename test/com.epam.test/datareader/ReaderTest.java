package com.epam.test.datareader;

import com.epam.oop.datareader.Reader;
import com.epam.oop.exception.FileReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReaderTest {
    private Reader reader;

    @BeforeClass
    public void setUp(){
        reader = new Reader();
    }

    @DataProvider
    public Object[] validDataForReader(){
        return new Object[][]{
                {"./resources/tariffData", 4}

        };
    }
    @Test(dataProvider = "validDataForReader")
    public void readFileWithValidPathSuccessfully(String path, int expectedLength){
        ArrayList<String> actualList = reader.readFile(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), expectedLength );
    }

    @DataProvider
    public Object[] invalidDataForReader(){
        return new Object[]
                {"./resources/DataFileTest123"};
    }

    @Test(dataProvider = "invalidDataForReader", expectedExceptions = FileReaderException.class)
    public void readFileWithInvalidPathCatchException(String path) throws FileReaderException {
        reader.readFile(path);
    }
}
