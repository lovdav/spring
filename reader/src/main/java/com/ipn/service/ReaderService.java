/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.service;

import com.ipn.reader.Reader;

/**
 *
 * @author dml
 */
public class ReaderService 
{
    private Reader reader;
    
    public ReaderService () {
        super();
    }
    
    public ReaderService (Reader reader) {
        this.reader = reader;
    }
    
    public String fetchData() {
        return getReader().read();
    }

    /**
     * @return the reader
     */
    public Reader getReader() {
        return reader;
    }

    /**
     * @param reader the reader to set
     */
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    
}
