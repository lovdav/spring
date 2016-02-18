/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.client;

import com.ipn.reader.Reader;
import com.ipn.reader.impl.FileReaderImpl;
import java.io.FileNotFoundException;


/**
 *
 * @author dml
 */
public class DataReaderClient {

    private Reader reader = null;

    public DataReaderClient(Reader reader) {
        this.reader = reader;
    }

    private String fetchData() {
        return reader.read();
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        String fileName = "res/Test.txt";
        Reader reader = new FileReaderImpl(fileName);
        
        DataReaderClient dataReader = new DataReaderClient(reader);
        System.out.println("Got data: " + dataReader.fetchData());
    }

}
