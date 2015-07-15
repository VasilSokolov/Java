/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Warehouse;
import java.util.List;

/**
 *
 * @author 123
 */
public interface WarehouseDao {
    public void add(Warehouse warehouse);
    public void edit(Warehouse warehouse);
    public void delete(int id);
    
    public Warehouse getWarehouse(int id);
    public List getAllEmployees();
}
