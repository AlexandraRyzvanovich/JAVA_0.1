package com.epam.oop.reader;

import com.epam.oop.exception.DataReaderException;
import com.epam.oop.validator.DataValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataReader {
    private static Logger logger = LogManager.getLogger();

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
            throw new DataReaderException("Exception occurred while reading a file", ex);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    logger.info("File was parsed successfully");
                } catch (IOException e) {
                    logger.error("Unable to close bufferReader", e);
                }
            }
        }
        return list;
    }
}
