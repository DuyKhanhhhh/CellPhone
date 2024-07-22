package com.example.cellphone.model;

import jakarta.persistence.*;
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String image;
    private String detail;
    private String screenSize;
    private String cpu;
    private String ram;
    private String operatingSystem;
    private String mainCamera;
    private String secondaryCamera;
    private String battery;
    private String display;
    @JoinColumn
    @ManyToOne
    private DetailProduct idDetailProduct;
    public Product() {}

    public Product(String battery, String cpu, String detail, String display, int id, DetailProduct idDetailProduct, String image, String mainCamera, String name, String operatingSystem, String ram, String screenSize, String secondaryCamera) {
        this.battery = battery;
        this.cpu = cpu;
        this.detail = detail;
        this.display = display;
        this.id = id;
        this.idDetailProduct = idDetailProduct;
        this.image = image;
        this.mainCamera = mainCamera;
        this.name = name;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.screenSize = screenSize;
        this.secondaryCamera = secondaryCamera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DetailProduct getIdDetailProduct() {
        return idDetailProduct;
    }

    public void setIdDetailProduct(DetailProduct idDetailProduct) {
        this.idDetailProduct = idDetailProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getSecondaryCamera() {
        return secondaryCamera;
    }

    public void setSecondaryCamera(String secondaryCamera) {
        this.secondaryCamera = secondaryCamera;
    }
}

