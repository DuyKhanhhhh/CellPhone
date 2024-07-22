package com.example.cellphone.model;

import jakarta.persistence.*;
@Entity
@Table(name = "detailProduct")
public class DetailProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int memory;
    private String color;
    @JoinColumn
    @ManyToOne
    private PriceProduct idPriceProduct;

    public DetailProduct() {
    }

    public DetailProduct(String color, int id, PriceProduct idPriceProduct, int memory) {
        this.color = color;
        this.id = id;
        this.idPriceProduct = idPriceProduct;
        this.memory = memory;
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

    public PriceProduct getIdPriceProduct() {
        return idPriceProduct;
    }

    public void setIdPriceProduct(PriceProduct idPriceProduct) {
        this.idPriceProduct = idPriceProduct;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}








