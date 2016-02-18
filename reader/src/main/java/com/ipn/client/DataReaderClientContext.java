/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.client;

import com.ipn.reader.Reader;
import com.ipn.service.ReaderService;
import java.io.FileNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dml
 */
public class DataReaderClientContext 
{
    private Reader reader;
    private ApplicationContext ctx;
    private ReaderService service;


    public DataReaderClientContext() {
        ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
    }

    private String getData() {
        service = (ReaderService) ctx.getBean("readerService");
        return service.fetchData();
    }

    public static void main(String[] args) throws FileNotFoundException 
    {
        DataReaderClientContext client = new DataReaderClientContext();
        System.out.println("Data: " + client.getData());

        System.out.println("Termina");
    }
}
