package org.example;

public class Account {
    protected String username;
    protected String password;
    protected String name;
    protected Address shippingAddress;
    protected String email;
    protected String phoneNumber;

    public Account(String username, String password, String name, Address address, String email, String phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.shippingAddress = address;
        this.email = email;
        this.phoneNumber = phone;
    }

    // You may add login, updateProfile, or changePassword methods here
}
