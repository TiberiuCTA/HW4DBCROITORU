package com.example.hw4dbcroitoru.repository;

import com.example.hw4dbcroitoru.Model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Integer> {
    public void delete(Product product);

    public List<Product> findAll();
}
