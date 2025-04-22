package org.example;

public class Item {
    private int productId;
    private double price;
    private int quantity;

    public Item(int productId, double price, int quantity) {
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean updateQty(int qty) {
        if (qty <= 0) return false;
        this.quantity = qty;
        return true;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

