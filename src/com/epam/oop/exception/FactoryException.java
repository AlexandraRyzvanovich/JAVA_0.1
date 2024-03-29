package com.epam.oop.exception;

public class FactoryException extends RuntimeException {
    public FactoryException(String message) {
        super(message);
    }

    public FactoryException(String message, Throwable cause) {
        super(message, cause);
    }
}
