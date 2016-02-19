/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.reader.impl;

import com.ipn.reader.Reader;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author dml
 */
public class NumberReader implements Reader 
{
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    private int dato;
    
    public NumberReader(int dato) {
        this.dato = dato;
        logger.info("Dato llegado: " + dato);
    }

    @Override
    public String read() {
        return "NumberReader" + this.dato;
    }
    
}
