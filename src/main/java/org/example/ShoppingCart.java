package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public boolean editQty(Item item, int qty) {
        return item.updateQty(qty);
    }

    public boolean checkout() {
        // Logic for placing order can be integrated here
        System.out.println("Proceeding to checkout with " + items.size() + " items.");
        return true;
    }

    public List<Item> getItems() {
        return items;
    }
}

