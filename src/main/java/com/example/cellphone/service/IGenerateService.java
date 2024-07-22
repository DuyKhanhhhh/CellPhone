package com.example.cellphone.service;

import java.util.Optional;

public interface IGenerateService<T>{
    Iterable<T> findAll();
    T save(T t);
    void delete(Integer id);
    Optional<T> findById(Integer id);

}
