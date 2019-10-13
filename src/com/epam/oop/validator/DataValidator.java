package com.epam.oop.validator;

import com.epam.oop.exception.ValidatorException;

public class DataValidator {
    private final String REGEX_LINE = "[A-z0-9;\\s+]*";


    public Boolean validateValues(String line) {

        if (line == null) {
            throw new ValidatorException("Line is empty");
        }

        return line.matches(REGEX_LINE);
    }
}
