/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.dao.impl;

import com.ipn.dao.ProductoDAO;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author dml
 */
public class ProductoDAOImpl implements ProductoDAO{
    
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public String getAllProducts() {
        String descripcion = this.getJdbcTemplate().queryForObject("select description from products where id = 1", String.class);
        return descripcion;
    }

    /**
     * @return the jdbcTemplate
     */
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
