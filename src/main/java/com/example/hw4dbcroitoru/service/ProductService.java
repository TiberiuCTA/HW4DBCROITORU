package com.example.hw4dbcroitoru.service;

import com.example.hw4dbcroitoru.Model.Point;
import com.example.hw4dbcroitoru.Model.Product;
import com.example.hw4dbcroitoru.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public  List<Product> getAllProducts() {
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Product getProductById(Integer id) {

        return productRepository.findById(id).get();
    }

    public Product save(Product p) {

        return productRepository.save(p);
    }

    public Product updateProduct(Integer id, Product product) {
        try {
            Product newproduct = productRepository.findById(id).get();
            newproduct.setName(product.getName());
            newproduct.setPrice(product.getPrice());
            return productRepository.save(newproduct);

        } catch (Exception e) {
            System.out.println("Status with id does not exist");
            return null;
        }
    }


    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
