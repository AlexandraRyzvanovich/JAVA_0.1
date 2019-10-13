package com.epam.oop.factory;

import com.epam.oop.exception.FactoryException;
import com.epam.oop.tariff.*;

import java.lang.reflect.Array;

public class Factory {
    public Tariff getTariff(String[] line) throws FactoryException{
            switch (line[0]) {
                case "Classic":
                    int smsCount = Integer.parseInt(line[5]);
                    return new ClassicTariff(line[0], Double.parseDouble(line[1]), CallerPackage.valueOf(line[2]), line[3],
                            Integer.parseInt(line[4]), smsCount);
                case "Business":
                    InternetPackage internetBusiness = InternetPackage.valueOf(line[5]);
                    int corporateSize = Integer.parseInt(line[6]);
                    return new BusinessTariff(line[0], Double.parseDouble(line[1]), CallerPackage.valueOf(line[2]), line[3],
                            Integer.parseInt(line[4]), internetBusiness, corporateSize);
                case "Pro":
                    TVPackage tvPackage = TVPackage.valueOf(line[5]);
                    InternetPackage internetPro = InternetPackage.valueOf(line[6]);
                    return new ProTariff(line[0], Double.parseDouble(line[1]), CallerPackage.valueOf(line[2]), line[3],
                            Integer.parseInt(line[4]), tvPackage, internetPro);
                case "Tourist":
                    Regions region = Regions.valueOf(line[5]);
                    return new TouristTariff(line[0], Double.parseDouble(line[1]), CallerPackage.valueOf(line[2]), line[3],
                            Integer.parseInt(line[4]), region);
                default:
                    throw new FactoryException("Impossible to create an object from File data");
            }
    }
}


