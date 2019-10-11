package com.epam.oop.validator;

import com.epam.oop.exception.ValidatorException;
import com.epam.oop.tariffModule.CallerPackage;

public class DataValidator {
    private final String REGEX_LINE = "[A-z;\\s4+]*";

    public Boolean validateValues(String line) {
        CallerPackage p = null;
        if (line == null) {
            throw new ValidatorException("Line is empty");
        }
        String[] array = line.split("; ");
        if (line.matches(REGEX_LINE)) {
            throw new IllegalArgumentException();
        }
                switch (line.length() - 1) {
                    case 1:
                        for (CallerPackage c:
                                CallerPackage.values()) {
                            c.getPackageName().equals(array[1]);
                            return line.matches(REGEX_LINE);
                        }
                    case 2:



                    default:
                        return false;

                }
    }
}
