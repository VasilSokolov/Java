/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.impl;

import com.dao.WarehouseDao;
import com.model.Warehouse;
import com.service.WarehouseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 123
 */
@Service
public class WarehouseServiceImpl implements WarehouseService{
    @Autowired
    private WarehouseDao warehouseDao;
    
    @Transactional
    public void add(Warehouse warehouse) {
        warehouseDao.add(warehouse);
    }

    @Transactional
    public void edit(Warehouse warehouse) {
        warehouseDao.edit(warehouse);
    }

    @Transactional
    public void delete(int id) {
        warehouseDao.delete(id);
    }

    @Transactional
    public Warehouse getWarehouse(int id) {
        return warehouseDao.getWarehouse(id);
    }

    @Transactional    
    public List getAllEmployees() {
        return warehouseDao.getAllEmployees();
    }
    
}
