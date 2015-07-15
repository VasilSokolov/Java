/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Warehouse;
import com.service.WarehouseService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author 123
 */
@Controller
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping("/index")
    public String setupForm(Map<String, Object> map){
        Warehouse warehouse = new Warehouse();
        map.put("warehouse", warehouse);
        map.put("warehouseList", warehouseService.getAllEmployees());
        return "warehouse";
    }
    
    @RequestMapping(value="/warehouse.do", method=RequestMethod.POST)
    public String doAction(@ModelAttribute Warehouse warehouse, BindingResult result, @RequestParam String action, Map<String, Object> map){
        Warehouse warehouseResult = new Warehouse();
        switch(action.toLowerCase()){  //only in Java7 you can put String in switch
            case "add":
                warehouseService.add(warehouse);
                warehouseResult = warehouse;
                break;
            case "edit":
                warehouseService.edit(warehouse);
                warehouseResult = warehouse;
                break;
            case "delete":
                warehouseService.delete(warehouse.getId());
                warehouseResult = new Warehouse();
                break;
            case "search":
                Warehouse searchedWarehouse = warehouseService.getWarehouse(warehouse.getId());
                warehouseResult = searchedWarehouse!=null ? searchedWarehouse : new Warehouse();
                break;
        }
        map.put("warehouse", warehouseResult);
        map.put("warehouseList", warehouseService.getAllEmployees());
        return "warehouse";
    }
}
