package com.epam.oop.exception;

public class UtilsException extends RuntimeException {

    public UtilsException(String message) {
        super(message);
    }
    public UtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}
