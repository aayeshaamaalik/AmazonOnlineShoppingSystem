package org.example;
import java.util.ArrayList;
import java.util.List;

public class Member extends Account {
    private List<Order> orderHistory;
    private ShoppingCart shoppingCart;

    public Member(String username, String password, String name, Address address, String email, String phone) {
        super(username, password, name, address, email, phone);
        this.orderHistory = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}

