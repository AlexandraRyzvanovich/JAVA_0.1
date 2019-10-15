package com.epam.oop.factory;

import com.epam.oop.exception.FactoryException;
import com.epam.oop.tariff.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factory {
    public Tariff getTariff(String[] line){
        Logger logger = LogManager.getLogger();
        String name;
        double subscriptionFee;
        CallerPackage callerPackage;
        String description;
        int clientsCount;
        try {
            name = line[0];
            subscriptionFee = Double.parseDouble(line[1]);
            callerPackage = CallerPackage.valueOf(line[2].toUpperCase());
            description = line[3];
            clientsCount = Integer.parseInt(line[4]);
        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException ex){
            throw new FactoryException("Impossible to convert line properly. Line is skipped", ex);
        }
            switch (line[0]) {
                case "Classic":
                    try {
                        int smsCount = Integer.parseInt(line[5]);
                        return new ClassicTariff(name, subscriptionFee, callerPackage, description, clientsCount, smsCount );
                    }catch (IllegalArgumentException e){
                        throw new FactoryException("Impossible to convert line properly. Line is skipped", e);
                    }

                case "Business":
                    try {
                        InternetPackage internetBusiness = InternetPackage.valueOf(line[5].toUpperCase());
                        int corporateSize = Integer.parseInt(line[6]);
                        return new BusinessTariff(name, subscriptionFee, callerPackage,
                                description, clientsCount, internetBusiness, corporateSize);
                    }catch (IllegalArgumentException e){
                        throw new FactoryException("Impossible to convert line properly. Line is skipped", e);
                    }

                case "Pro":
                    try{
                        TVPackage tvPackage = TVPackage.valueOf(line[5].toUpperCase());
                        InternetPackage internetPro = InternetPackage.valueOf(line[6].toUpperCase());
                        return new ProTariff(name, subscriptionFee, callerPackage, description, clientsCount, tvPackage, internetPro);
                    }catch (IllegalArgumentException e){
                        throw new FactoryException("Impossible to convert line properly. Line is skipped", e);
                    }

                case "Tourist":
                    try{
                        Regions region = Regions.valueOf(line[5].toUpperCase());
                        return new TouristTariff(name, subscriptionFee, callerPackage, description, clientsCount, region);
                    }catch (IllegalArgumentException e){
                        throw new FactoryException("Impossible to convert line properly. Line is skipped", e);
                    }
                default:
                    throw new FactoryException("Impossible to create an object from File data");
            }
    }
}


