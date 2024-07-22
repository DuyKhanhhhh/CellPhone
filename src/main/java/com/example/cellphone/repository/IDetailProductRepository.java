package com.example.cellphone.repository;

import com.example.cellphone.model.DetailProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailProductRepository extends JpaRepository<DetailProduct, Integer> {
}
