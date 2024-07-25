package com.example.cellphone.controller;

import com.example.cellphone.model.DetailProduct;
import com.example.cellphone.service.detailProduct.DetailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/detailProduct")
@CrossOrigin
public class ProductDetailController {
    @Autowired
    private DetailProductService detailProductService;

    @GetMapping
    private ResponseEntity<List<DetailProduct>> getAllProducts() {
        List<DetailProduct> detailProducts = (List<DetailProduct>) detailProductService.findAll();
        if (detailProducts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(detailProducts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<DetailProduct> getProductById(@PathVariable int id) {
        Optional<DetailProduct> detailProduct = detailProductService.findById(id);
        if (detailProduct.isPresent()) {
            return new ResponseEntity<>(detailProduct.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
