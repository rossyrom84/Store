package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/health")
    public String check() {
        String greeting = "Hello! I'm a server.";
        return greeting;
    }

    private final List<Product> products = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> allProducts() {
        return  products; }

    @PostMapping("/products")
    public void addNewProduct(Product product) {
        products.add(product);
    }
}


