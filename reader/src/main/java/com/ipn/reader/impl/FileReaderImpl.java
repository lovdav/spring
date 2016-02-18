/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.reader.impl;

import com.ipn.reader.Reader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dml
 */
public class FileReaderImpl implements Reader{

    private StringBuilder builder = null;
    private Scanner scanner = null;

    public FileReaderImpl(String fileName) throws FileNotFoundException {
        scanner = new Scanner(new File(fileName));
        builder = new StringBuilder();
    }

    @Override
    public String read() {
        while (scanner.hasNext()) {
            builder.append(scanner.next());
        }
        return builder.toString();
    }

}
