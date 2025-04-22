package org.example;

public class ProductReview {
    private int rating;
    private String review;
    private String username;

    public ProductReview(int rating, String review, String username) {
        this.rating = rating;
        this.review = review;
        this.username = username;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public String getUsername() {
        return username;
    }
}

