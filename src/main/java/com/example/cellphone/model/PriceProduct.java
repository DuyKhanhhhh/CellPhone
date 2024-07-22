package com.example.cellphone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "priceProduct")
public class PriceProduct {
    @Id
    @GeneratedValue
    private int id;
    private int price;

    public PriceProduct() {
    }

    public PriceProduct(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
