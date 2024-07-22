package com.example.cellphone.service.product;

import com.example.cellphone.model.Product;
import com.example.cellphone.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

}
