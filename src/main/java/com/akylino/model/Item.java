package com.akylino.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Items")
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    private int id;
    private String name;
    private int price;
    private int quantity;
    @Transient
    private int value;

    public String toString() {
        return String.format("Item[%d, %s, %d, %d]", id, name, price, quantity);
    }
}
