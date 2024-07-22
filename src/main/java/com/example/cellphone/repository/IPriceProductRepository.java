package com.example.cellphone.repository;

import com.example.cellphone.model.PriceProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPriceProductRepository extends JpaRepository<PriceProduct, Integer> {
}
