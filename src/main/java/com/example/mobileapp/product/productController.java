package com.example.mobileapp.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productservice;
    // Api to Account registration with email
    @PostMapping("product")


    public Product createAccount(@RequestBody Product products) {

        return this.productservice.createProduct(products);
    }
    @PutMapping("update/product")
    public Product updateAccount(@RequestBody Product products) {
        return this.productservice.updateProduct(products);
    }
    @GetMapping("product/{id}")
    public Product getAccountById(@PathVariable("id") Integer accountId) {
        return this.productservice.getAccountById(accountId);
    }


}
