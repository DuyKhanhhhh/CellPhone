package com.example.cellphone.controller;

import com.example.cellphone.model.Product;
import com.example.cellphone.model.modelDTO.ProductDTO;
import com.example.cellphone.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    private ResponseEntity<?> getAllProducts() {
        List<ProductDTO> products = productService.findAllProductPrice();
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Product> getProductById(@PathVariable int id) {
        Optional<Product> products = productService.findById(id);
        if (products.isPresent()) {
            return new ResponseEntity<>(products.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
