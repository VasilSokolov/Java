/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.WarehouseDao;
import com.model.Warehouse;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 123
 */
@Repository
public class WarehouseDaoImpl implements WarehouseDao{
    @Autowired
    private SessionFactory session;
    
    @Override
    public void add(Warehouse warehouse) {
        session.getCurrentSession().save(warehouse);
    }

    @Override
    public void edit(Warehouse warehouse) {
       session.getCurrentSession().update(warehouse);
    }

    @Override
    public void delete(int id) {        
        session.getCurrentSession().delete(getWarehouse(id));
    }

    @Override
    public Warehouse getWarehouse(int id) {
        return (Warehouse)session.getCurrentSession().get(Warehouse.class, id);
    }

    @Override
    public List getAllEmployees() {
        return session.getCurrentSession().createQuery("from Warehouse").list();
    }
    
    
}
