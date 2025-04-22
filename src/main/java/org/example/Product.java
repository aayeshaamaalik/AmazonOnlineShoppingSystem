package org.example;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int productId;
    String name;
    private String description;
    double price;
    private int stock;
    Category category;
    private boolean onSale;
    private double discount;
    private List<ProductReview> reviews;

    public Product(int productId, String name, String description, double price, int stock, Category category) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.onSale = false;
        this.discount = 0.0;
        this.reviews = new ArrayList<>();
    }

    public boolean addReview(int rating, String review, String username) {
        ProductReview newReview = new ProductReview(rating, review, username);
        return reviews.add(newReview);
    }

    // Getters and setters can be added as needed
}

