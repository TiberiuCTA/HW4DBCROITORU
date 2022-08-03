package com.example.hw4dbcroitoru.Controllers;

import com.example.hw4dbcroitoru.Model.Point;
import com.example.hw4dbcroitoru.Model.Product;
import com.example.hw4dbcroitoru.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    @Autowired
    ProductService productService;
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product)
    {
        return productService.save(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product)
    {
        return productService.updateProduct(id,product);
    }
    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
    }

}
