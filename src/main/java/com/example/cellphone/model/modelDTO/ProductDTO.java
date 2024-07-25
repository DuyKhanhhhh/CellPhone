package com.example.cellphone.model.modelDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private int id;
    private String name;
    private String image;
    private String detail;
    private String screenSize;
    private String cpu;
    private String operatingSystem;
    private String mainCamera;
    private String secondaryCamera;
    private String battery;
    private String display;
    private String price;
}

