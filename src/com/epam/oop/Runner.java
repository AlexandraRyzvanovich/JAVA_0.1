package com.epam.oop;


import com.epam.oop.tariffModule.CallerPackage;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Reader -> Factory -> Validator ->  TariffList<> ->
        // TariffList -> sort (price)
        //(calculate clients)  -> Add client (use TariffList) -> ClientsList -> Calculate
        //Logger
            //finder ???

        CallerPackage p = null;
        String b;
        String a = "Internal";
        boolean res;
        for (CallerPackage c:
             CallerPackage.values()) {

           b = c.getPackageName();
        }

    }
}
