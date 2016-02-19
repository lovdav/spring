/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.client;

import com.ipn.dao.ProductoDAO;
import com.ipn.dao.impl.ProductoDAOImpl;
import com.ipn.reader.Reader;
import com.ipn.service.ReaderService;
import org.junit.Before;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dml
 */
public class ClienteReaderTest 
{
    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    private Reader reader;
    private ApplicationContext ctx;
    private ReaderService service;
    
     @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("reader-beans.xml");
        assertNotNull( ctx );
        logger.debug("Inicio de la prueba unitaria");
    }
    
    @Test
    public void leerFTPReader() 
    {
        String dato;
        logger.debug("Termina de leer");
        dato = this.getData();
        assertEquals(dato, "oreilly.com - 9000");
    }
    
    //@Test
    public void leerNumberReader() 
    {
        String dato;
        logger.debug("Termina de leer");
        dato = this.getData();
        assertEquals(dato, "NumberReader10");
    }
    
    @Test
    public void testJdbcTemplate(){
        ProductoDAOImpl product = (ProductoDAOImpl) ctx.getBean("productoDao");
        String descripcion = product.getAllProducts();
        assertEquals(descripcion,"Lamp");
    }
    
    private String getData() {
        service = (ReaderService) ctx.getBean("readerService");
        return service.fetchData();
    }
}
