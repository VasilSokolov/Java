/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 123
 */

@Entity
public class Warehouse {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
    private int id;    
    @Column
    private String employee_name;
    @Column
    private String company_name;
    @Column
    private String article;
    @Column
    private int article_number;
    @Column
    private int price;
    @Column
    private int delivery_date;
    @Column
    private String servant;

    public Warehouse(){}

    public Warehouse(int id, String employee_name, String company_name, String article, int article_number, int price, int delivery_date, String servant) {
        this.id = id;
        this.employee_name = employee_name;
        this.company_name = company_name;
        this.article = article;
        this.article_number = article_number;
        this.price = price;
        this.delivery_date = delivery_date;
        this.servant = servant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmploee_name() {
        return employee_name;
    }

    public void setEmploee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getArticle_number() {
        return article_number;
    }

    public void setArticle_number(int article_number) {
        this.article_number = article_number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(int delivery_date) {
        this.delivery_date = delivery_date;
    }

    public String getServant() {
        return servant;
    }

    public void setServant(String servant) {
        this.servant = servant;
    }
   

    
    
    
}
