package com.example.cellphone.service.detailProduct;

import com.example.cellphone.model.DetailProduct;
import com.example.cellphone.model.Product;
import com.example.cellphone.service.IGenerateService;

public interface IDetailProductService extends IGenerateService<DetailProduct> {
    DetailProduct findMinPriceByIdProduct(int idProduct);

}
