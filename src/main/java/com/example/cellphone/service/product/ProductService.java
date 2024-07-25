package com.example.cellphone.service.product;

import com.example.cellphone.model.Product;
import com.example.cellphone.model.modelDTO.ProductDTO;
import com.example.cellphone.repository.IDetailProductRepository;
import com.example.cellphone.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private IDetailProductRepository detailProductRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }

    public List<ProductDTO> findAllProductPrice() {
        List<ProductDTO> products = new ArrayList<>();
        Iterable<Product> listProduct = this.findAll();
        for (Product product : listProduct) {
            ProductDTO productDTO = ProductDTO.builder()
                    .id(product.getId())
                    .cpu(product.getCpu())
                    .battery(product.getBattery())
                    .image(product.getImage())
                    .detail(product.getDetail())
                    .name(product.getName())
                    .mainCamera(product.getMainCamera())
                    .operatingSystem(product.getOperatingSystem())
                    .screenSize(product.getScreenSize())
                    .secondaryCamera(product.getSecondaryCamera())
                    .display(product.getDisplay())
//                    .price(detailProductRepository.findMinPriceByIdProduct(product.getId()))
                    .build();

            products.add(productDTO);
        }

        return products;
    }

}
