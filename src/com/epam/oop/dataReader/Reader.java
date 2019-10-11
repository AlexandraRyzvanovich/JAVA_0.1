package com.epam.oop.dataReader;

import com.epam.oop.factory.Factory;
import com.epam.oop.exception.FileReaderException;
import com.epam.oop.tarifInfo.Tariff;
import com.epam.oop.validator.DataValidator;

import javax.print.attribute.standard.NumberUp;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public  List<Tariff> readFile(String path) {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader bufferedReader = null;
        Path filePath = Paths.get(path);
        List<Tariff> tariffList = null;
        try {
            String line;
            bufferedReader = Files.newBufferedReader(filePath);
            while ((line = bufferedReader.readLine()) != null) {
               // tariffList.aDD(Factory.getTarid(line))

            }
        } catch (IOException ex) {
            throw new FileReaderException("Exception occurred while reading a file", ex);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            }
        }
        return tariffList;
    }

}
