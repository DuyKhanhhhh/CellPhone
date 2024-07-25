package com.example.cellphone.model;

import jakarta.persistence.*;
@Entity
@Table(name = "detailProduct")
public class DetailProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String memory;
    private String color;
    private int price;
    @JoinColumn
    @ManyToOne
    private Product idProduct;
    public DetailProduct() {
    }

    public DetailProduct(int id, String memory, String color, int price, Product idProduct) {
        this.id = id;
        this.memory = memory;
        this.color = color;
        this.price = price;
        this.idProduct = idProduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}








