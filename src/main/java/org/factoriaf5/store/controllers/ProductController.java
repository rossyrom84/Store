package org.factoriaf5.store.controllers;

import org.factoriaf5.store.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@RestController
public class ProductController {
    @GetMapping("/health")
    public String check() {
        String greeting = "Hello! I'm a server.";
        return greeting;
    }

    private ArrayList<Product> products;
    public ProductController() {
        products = new ArrayList<>();
    }
    @GetMapping("/products")
    public  ArrayList<Product> allproducts() { return  products; }

    @PostMapping("/products")
    public RedirectView addNewProduct(Product product) {
        products.add(product);
        return new RedirectView("/products")
    }
};


