package com.example.cellphone.repository;

import com.example.cellphone.model.DetailProduct;
import com.example.cellphone.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetailProductRepository extends JpaRepository<DetailProduct, Integer> {
    @Query("SELECT MIN(dp.price) "
            + "FROM DetailProduct dp "
            + "WHERE dp.idProduct.id = :idProduct")
    DetailProduct findMinPriceByIdProduct(int idProduct);
}
