package com.epam.oop.validator;

import com.epam.oop.exception.ValidatorException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataValidator {

    Logger log = LogManager.getLogger(DataValidator.class.getName());

    private final String REGEX_LINE = "[A-z0-9;\\s+]*";

    public Boolean validateValues(String line) {

        if (line == null) {
            throw new ValidatorException("Line is empty");
        }

        return line.matches(REGEX_LINE);
    }
}
