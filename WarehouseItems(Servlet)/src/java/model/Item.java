/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.*;
/**
 *
 * @author bagnes
 */
@Entity
@Table
@NamedQueries({@NamedQuery(name="Item.getAll", query="Select e from Item e")})
public class Item {
    @Id
    @Column
    private String itemId;
    @Column
    private String type;
    @Column
    private int availability;
    @Column
    private String accountablePerson;
    @Column
    private Double price;

    public Item(){}
    public Item(String itemId, String type, int availability, String accountablePerson, Double price) {
        this.itemId = itemId;
        this.type = type;
        this.availability = availability;
        this.accountablePerson = accountablePerson;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getAccountablePerson() {
        return accountablePerson;
    }

    public void setAccountablePerson(String accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    

    
}
