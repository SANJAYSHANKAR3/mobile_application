package com.example.mobileapp.cart;


import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======

import com.example.mobileapp.product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

>>>>>>> 2a5db5ae919ad50b97eb13a9e5570e84c5cf0947
import com.example.mobileapp.product.Product;
import jakarta.persistence.*;

@Entity
@Table(name="CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="QUANTITY")
    private Integer quantity;

    @ManyToMany
    private List<Product> products = new ArrayList<>();


    public Cart() {
        super();
    }


<<<<<<< HEAD
    public Cart(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart(Integer id, List<Product> products) {
=======
    public Cart(Integer id, List<Product> products,Integer quantity) {
>>>>>>> 2a5db5ae919ad50b97eb13a9e5570e84c5cf0947
        super();
        this.quantity = quantity;
        this.id = id;
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}