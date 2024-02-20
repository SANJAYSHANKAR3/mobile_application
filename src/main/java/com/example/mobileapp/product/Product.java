package com.example.mobileapp.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
<<<<<<< HEAD
=======
@Getter
@Setter
@Table(name="product")
>>>>>>> 2a5db5ae919ad50b97eb13a9e5570e84c5cf0947
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="brand_name")
    private String brandName;
    @Column(name="model_name")
    private String modelName;
    @Column(name="price")
    private Double price;
    @Column(name="color")
    private String color;
    private Integer quantity;

    public Product() {
        super();
    }
<<<<<<< HEAD
    public Product(Integer id, String brandName, String modelName, Double price, String color) {
=======
    public Product(Integer id, String brandName, String modelName, Double price, String color,Integer quantity) {
>>>>>>> 2a5db5ae919ad50b97eb13a9e5570e84c5cf0947
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.color = color;
        this.id=id;
        this.quantity=quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return 0;
    }
}
