package com.example.products.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.demo.model.Product;

@RestController
@RequestMapping("products")
public class ProdoctsController {

    @GetMapping
    public ResponseEntity<List<Product>> getListProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Camiseta de algodão", 105.00));
        products.add(new Product(2L, "Casaco ", 160.00));
        products.add(new Product(3L, "Calça Jeans", 79.99));
        return ResponseEntity.ok(products);
    }
}
