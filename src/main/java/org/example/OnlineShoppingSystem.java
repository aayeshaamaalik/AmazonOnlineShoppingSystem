package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OnlineShoppingSystem {
    private List<Product> products;
    private List<Member> members;
    private List<Admin> admins;

    public OnlineShoppingSystem() {
        this.products = new ArrayList<>();
        this.members = new ArrayList<>();
        this.admins = new ArrayList<>();
    }

    // Admin actions
    public boolean addProduct(Product product, Admin admin) {
        if (admins.contains(admin)) {
            products.add(product);
            return true;
        }
        return false;
    }

    public boolean updateProduct(Product updatedProduct, Admin admin) {
        if (!admins.contains(admin)) return false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).equals(updatedProduct)) {
                products.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(Product product, Admin admin) {
        if (admins.contains(admin)) {
            return products.remove(product);
        }
        return false;
    }

    public void addAdmin(Admin admin) {
        admins.add(admin);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    // Search and filters
    public List<Product> searchByKeyword(String keyword) {
        return products.stream()
                .filter(p -> p.name.toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Product> filterByCategory(Category category) {
        return products.stream()
                .filter(p -> p.category == category)
                .collect(Collectors.toList());
    }

    public List<Product> filterByPriceRange(double min, double max) {
        return products.stream()
                .filter(p -> p.price >= min && p.price <= max)
                .collect(Collectors.toList());
    }
}

