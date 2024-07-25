package com.example.cellphone.service.detailProduct;

import com.example.cellphone.model.DetailProduct;
import com.example.cellphone.model.Product;
import com.example.cellphone.repository.IDetailProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DetailProductService implements IDetailProductService {
@Autowired
private IDetailProductRepository detailProductRepository;

    @Override
    public Iterable<DetailProduct> findAll() {
        return detailProductRepository.findAll();
    }

    @Override
    public DetailProduct save(DetailProduct detailProduct) {
        return detailProductRepository.save(detailProduct);
    }

    @Override
    public void delete(Integer id) {
        detailProductRepository.deleteById(id);
    }

    @Override
    public Optional<DetailProduct> findById(Integer id) {
        return detailProductRepository.findById(id);
    }

    @Override
    public DetailProduct findMinPriceByIdProduct(int idProduct) {
        return detailProductRepository.findMinPriceByIdProduct(idProduct);
    }
}
