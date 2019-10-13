package com.epam.oop.datareader;

import com.epam.oop.exception.FileReaderException;
import com.epam.oop.validator.DataValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Reader {
    public  ArrayList<String> readFile(String path) {
        BufferedReader bufferedReader = null;
        Path filePath = Paths.get(path);
        DataValidator validator = new DataValidator();
        ArrayList<String> list = new ArrayList<>();
        try {
            String line;
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
                boolean isValid = validator.validateValues(line);
                if (isValid) {
                    list.add(line);
                }
            }
        } catch (IOException ex) {
            throw new FileReaderException("Exception occurred while reading a file", ex);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    //logger
                }
            }
        }
        return list;
    }
}
