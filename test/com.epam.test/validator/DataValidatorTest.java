package com.epam.test.validator;

import com.epam.oop.validator.DataValidator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    public class DataValidatorTest {
        private DataValidator validator;

        @BeforeClass
        public void setUp(){
            validator = new DataValidator();
        }

        @DataProvider
        public Object[][] validator_Data_Provider(){
            return new Object[][]{
                    {"Classic; 50; Internal; Tariff for people who like to talk; 1050; 100", true},
                    {"Business; 100; Full;  Tariff for a business team; 6000; Unlimited; 100", true},
                    {"de %%%fd fdds dcfdc", false},
                    {"Business, 100; Full;  Tariff for a business team; 6000; Unlimited; 100", false}
            };
        }

        @Test(dataProvider = "validator_Data_Provider")
        public void validatorTest(String line, boolean expectedResult){
            boolean actualResult = validator.validateValues(line);
            Assert.assertEquals(expectedResult, actualResult);
        }
    }

